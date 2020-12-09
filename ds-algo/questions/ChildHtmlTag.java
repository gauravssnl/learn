/*
 *Refer the PDF for task details
*/

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/*
 * Should not use 
 * javax.xml.* or 
 * org.w3c.* or
 * org.jsoup.* or
 * any other such libraries
 * You should find the logic from scratch
*/

public class ChildHtmlTag {

	public static void main(String[] args) throws IOException {

		String inputHTMLTags = new String(Files.readAllBytes(Paths.get("htmlFile.txt")));
		// System.out.println(inputHTMLTags);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to enter the line number or 2 to enter the tag name:");
		int userInput1 = sc.nextInt();

		switch (userInput1) {
			case 1:
				System.out.println("Enter the line number:");
				int lineNumber = sc.nextInt();
				findchildUsingLineNumber(inputHTMLTags, lineNumber);
				break;
			case 2:
				System.out.println("Enter the tag name:");
				sc.nextLine();
				String tagName = sc.nextLine();
				findchildUsingTagName(inputHTMLTags, tagName);
				break;
			default:
				System.out.println("Invalid Option at Switch");
		}
		sc.close();
	}

	public static void findchildUsingLineNumber(String inputHTMLTags, int lineNumber) {

		ArrayList<String> child = new ArrayList<String>();

		/*
		 * Write your logic here
		 */
		// let us find the tagName on the given lineNumber
		Optional<String> optionalTagName = inputHTMLTags.lines().skip(lineNumber - 1).limit(1).findFirst();
		if (inputHTMLTags != null && !"".equals(inputHTMLTags) && optionalTagName.isPresent()) { // null & empty input
																									// check
			String tagName = optionalTagName.get().trim();
			boolean isEndTagFlag = false;
			if (tagName.startsWith("</") || tagName.contains("/>"))
				isEndTagFlag = true;
			tagName = tagName.replaceAll("<|>|/", ""); // get tagname without <, > /
			// System.out.println("Tag at given line: " + tagName);
			String startTagName = "<" + tagName + "";
			String endTagName = "</" + tagName + "";
			int startTagIndex = inputHTMLTags.indexOf(startTagName); // index of start tag
			// System.out.println("startTagIndex: " + startTagIndex);
			int endTagIndex = inputHTMLTags.indexOf(endTagName); // // index of end tag
			// System.out.println("endTagIndex: " + endTagIndex);
			// The below condition will also handle 1st case where tag starts at the same
			// line & end at the same line
			if (!isEndTagFlag && startTagIndex != -1 && endTagIndex != -1) { // start tagName is found & end tagName is
																				// found
				String subStringForTest = inputHTMLTags.substring(startTagIndex, endTagIndex);
				// System.out.println("subStringForTest: " + subStringForTest);
				// String[] childTagNameList = subStringForTest.split("\n"); // Note :this
				// incudes <> also
				// System.out.println("childTagNameList: " + Arrays.toString(childTagNameList));
				String previouslyReadTagName = ""; // use this to skip grandchild; use it like a stack with 1 value
				for (String childTagName : subStringForTest.lines().skip(1).collect(Collectors.toList())) { // skipping
																											// the 1st
																											// value as
																											// it
																											// contains
																											// the input
																											// tagName
																											// itself

					// find whether the current tag is a end tag, then we will use this later to pop
					// the previouslyReadTagName
					boolean isEndTag = childTagName.startsWith("</" + previouslyReadTagName.replaceAll("<|>|/", ""));
					// System.out.println("Current childTagName : " + childTagName + "
					// previouslyReadTagName: " + previouslyReadTagName + " isEndTag: " + isEndTag);
					// if we are reading new tag, push it . It should not be end tag of
					// previouslyReadTagName or grandchildren.
					if ("".equals(previouslyReadTagName) && !isEndTag) {
						String outputchildTagName = childTagName.replaceAll("<|>|/", "");
						if (!child.contains(outputchildTagName))
							child.add(outputchildTagName); // remove < & > from the output

						// if tag name starts and end at the same line , so no need to push it it to
						// previouslyReadTagName else push it
						if (!childTagName.endsWith("/>"))
							previouslyReadTagName = childTagName;
					}
					// if we enounter end tag of the previously read tag then pop/remove the
					// previously read tag
					if (isEndTag)
						previouslyReadTagName = ""; // we enounter end tag of the previously read tag

				}

			}
		}
		System.out.println("Output: " + child);
	}

	public static void findchildUsingTagName(String inputHTMLTags, String tagName) {

		ArrayList<String> child = new ArrayList<String>();

		/*
		 * Write your logic here
		 */
		if (inputHTMLTags != null && !"".equals(inputHTMLTags)) { // null & empty input check
			String startTagName = "<" + tagName + "";
			String endTagName = "</" + tagName + "";
			int startTagIndex = inputHTMLTags.indexOf(startTagName); // index of start tag
			// System.out.println("startTagIndex: " + startTagIndex);
			int endTagIndex = inputHTMLTags.indexOf(endTagName); // // index of end tag
			// System.out.println("endTagIndex: " + endTagIndex);
			// The below condition will also handle 1st case where tag starts at the same
			// line & end at the same line
			if (startTagIndex != -1 && endTagIndex != -1) { // start tagName is found & end tagName is found
				String subStringForTest = inputHTMLTags.substring(startTagIndex, endTagIndex);
				// String[] childTagNameList = subStringForTest.split("\n"); // Note :this
				// incudes <> also
				// System.out.println("childTagNameList: " + Arrays.toString(childTagNameList));
				String previouslyReadTagName = ""; // use this to skip grandchild; use it like a stack with 1 value
				for (String childTagName : subStringForTest.lines().skip(1).collect(Collectors.toList())) { // skipping
																											// the 1st
																											// value as
																											// it
																											// contains
																											// the input
																											// tagName
																											// itself
					// find whether the current tag is a end tag, then we will use this later to pop
					// the previouslyReadTagName
					// boolean isEndTag = childTagName.endsWith("</" + previouslyReadTagName);
					boolean isEndTag = childTagName.startsWith("</" + previouslyReadTagName.replaceAll("<|>|/", ""));
					// System.out.println("Current childTagName : " + childTagName + "
					// previouslyReadTagName: " + previouslyReadTagName + " isEndTag: " + isEndTag);
					// if we are reading new tag, push it . It should not be end tag of
					// previouslyReadTagName or grandchildren.
					if ("".equals(previouslyReadTagName) && !isEndTag) {
						String outputchildTagName = childTagName.replaceAll("<|>|/", "");
						if (!child.contains(outputchildTagName))
							child.add(outputchildTagName); // remove < & > from the output

						// if tag name starts and end at the same line , so no need to push it it to
						// previouslyReadTagName else push it
						if (!childTagName.endsWith("/>"))
							previouslyReadTagName = childTagName;
					}
					// if we enounter end tag of the previously read tag then pop/remove the
					// previously read tag
					if (isEndTag)
						previouslyReadTagName = ""; // we enounter end tag of the previously read tag

				}

			}
		}

		System.out.println("Output: " + child);
	}

}