package BasicSyntax

/**
 * Created by qinbingbing on 10/20/16.
 * Operator overloading
 */

assert 3 + 4 == 3.plus(4)
assert 3 * 4 == 3.multiply(4)

assert 2 ** 6 == 64
assert 2 ** 6 == 2.power(6)

assert 'abc' * 3 == 'abcabcabc'
try {
    3 * 'abc'
} catch (MissingMethodException e) {
    println(e)
}

String s = 'this is a string'
assert s + ' and more' == 'this is a string and more'
assert s - 'is' == 'th is a string'
assert s - 'is' - 'is' == 'th  a string'

Date now = new Date()
println now
Date tomorrow = now + 1
println tomorrow
assert tomorrow - 1 == now

assert new String('abc') == new String('abc')
//assert new String('abc').is(new String('abc'))

assert 'abc' == 'abc'
assert 'abc'.is('abc')

