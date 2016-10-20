package BasicSyntax

/**
 * Created by qinbingbing on 10/20/16.
 */

// Some basic data types in Groovy
assert 3.class == Integer
assert (3.5).class == BigDecimal
assert 'abc' instanceof String
assert "abc" instanceof String

String name = 'Dolly'
assert "Hello, ${name}!" == 'Hello, Dolly!'
assert "Hello, $name!" == 'Hello, Dolly!'
assert "Hello, $name!" instanceof GString