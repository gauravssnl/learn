def coin_change(amount, coins: list):
    """ Returns the minimum no. of selected denomination of coins as comma-separated values. """
    coin_choosen = 0
    if amount in coins:
        return amount
    for i in range(len(coins)):
        if coins[i] < amount:
            coin_choosen = coins[i]
        else:
            break
    remaining_amount = amount - coin_choosen
    return "" + str(coin_choosen) + ", " + str(coin_change(remaining_amount, coins))


if __name__ == '__main__':
    coins = [1, 3, 5, 6]
    amount = 8
    print(coin_change(amount, coins))

    coins = [1, 2, 5, 10]
    amount = 15
    print(coin_change(amount, coins))
