package BasicSyntax

/**
 * Created by qinbingbing on 10/20/16.
 * Static versus dynamic data types
 */
Integer n = 3;
Date now = new Date()

def x = 3
assert x.class == Integer.class
x = 'abc'
assert x.class == String.class
x = new Date()
assert x.class == Date.class