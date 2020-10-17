interface Sample {
    void display();
}

public class AnonymousInnerClass {
    Sample sample1 = new Sample() {
        
        @Override
        public void display() {
            // TODO Auto-generated method stub
            System.out.println("AnonymousInnerClass.sample1.new Sample() {...}.display()");
        }

    };
    // Anonymous Inner type
    Sample sample2 = new Sample() {

        @Override
        public void display() {
            // TODO Auto-generated method stub
            System.out.println("AnonymousInnerClass.sample2.new Sample() {...}.display()");
        }
        
    };

    public static void main(final String[] args) {
        final AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();
        anonymousInnerClass.sample1.display();
        anonymousInnerClass.sample2.display();
    }
}
