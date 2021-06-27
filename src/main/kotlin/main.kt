import java.security.KeyFactory
import java.security.KeyPairGenerator
import java.security.spec.PKCS8EncodedKeySpec
import java.util.*

const val ED25519 = "Ed25519"

fun main(args: Array<String>) {
    // EdDSA is supported from Java 15
    val keyPair = KeyPairGenerator.getInstance(ED25519).generateKeyPair()
    with(keyPair.private) {
        val base64encoded = Base64.getEncoder().encodeToString(encoded)
        println("Private Key - format:$format, encoded:$base64encoded")
    }
    with(keyPair.public) {
        val base64encoded = Base64.getEncoder().encodeToString(encoded)
        println("Public Key - format:$format, encoded:$base64encoded")
    }
}