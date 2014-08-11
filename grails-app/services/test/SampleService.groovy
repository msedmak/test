package test

import grails.transaction.Transactional

@Transactional
class SampleService {

    def hello() {
        "hello"
    }
}
