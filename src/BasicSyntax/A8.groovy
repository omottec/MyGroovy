package BasicSyntax

/**
 * Created by qinbingbing on 10/20/16.
 * Collection examples and methods
 */

def nums = [3, 1, 4, 1, 5, 9, 2, 6, 5]
assert nums instanceof ArrayList

Set uniques = nums as Set
assert uniques == [3, 1, 4, 5, 9, 2, 6] as Set

def sorted = nums as SortedSet
assert sorted == [1, 2, 3, 4, 5, 6, 9] as SortedSet
assert sorted instanceof TreeSet

assert nums[0] == 3
assert nums[1] == 1
assert nums[-1] == 5    // end of list
assert nums[-2] == 6

assert nums[0..3] == [3, 1, 4, 1]
assert nums[-3..-1] == [2 ,6, 5]
assert nums[-1..-3] == [5, 6, 2]

String hello = 'hello'
assert 'olleh' == hello[-1..0]
