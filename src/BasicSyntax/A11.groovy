package BasicSyntax

/**
 * Created by qinbingbing on 10/20/16.
 * Using Groovy's collect method to transform a collection
 */

def nums = [3, 1, 4, 1, 5, 9]
def doubles = nums.collect {
    it * 2
}
assert doubles == [6, 2, 8, 2, 10, 18]
