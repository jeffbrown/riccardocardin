package riccardocardin

import spock.lang.Specification

class LibraryTest extends Specification {
    def "test mocking a service method that accepts int params"() {
        when:
        MathService service = Mock() {
            1 * add(_ as Integer, _ as Integer) >>  2112
        }
        Library lib = new Library(service)
        int x = 4
        int y = 5
        int result = lib.add(x, y)

        then:
        result == 2112
    }
}
