package BasicSyntax

/**
 * Created by qinbingbing on 10/20/16.
 * Map instances and methods
 */

def map = [a:1, b:2, c:2]
assert map.getClass() == LinkedHashMap
assert map.a == 1
assert map['b'] == 2
assert map.get('c') == 2
