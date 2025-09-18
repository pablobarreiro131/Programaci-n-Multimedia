package Teoria

import java.util.UUID

class Constructores {
    var id: String
    var name: String

    init {
        id = UUID.randomUUID().toString()
    }

    protected constructor(name: String) {
        this.name = name
        id = UUID.randomUUID().toString()
    }

    constructor(id: String, name: String) {
        this.name = name
        this.id = id
    }
}