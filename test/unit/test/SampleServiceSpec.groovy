package test

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(SampleService)
class SampleServiceSpec extends Specification {

    def result

    def setup() {
    }

    def cleanup() {
    }

    void "hello"() {
        given:

        when:
            result = service.hello()

        then:
            assertSame(result, "hello")
    }
}
