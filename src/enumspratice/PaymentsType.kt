package enumspratice

enum class PaymentsType(val label: String): Payable {
    PAID("지급") {
        override fun isPayable(): Boolean {
            print(this.label)
            return true
        }
    },
    UNPAID("미지급") {
        override fun isPayable(): Boolean {
            print(this.label)
            return false
        }
    },
    FAILED("지급실패") {
        override fun isPayable(): Boolean {
            print(this.label)
            return false
        }
    },
    REFUND("환불") {
        override fun isPayable(): Boolean {
            print(this.label)
            return true
        }
    }
}

interface Payable {
    fun isPayable(): Boolean
}

fun main() {
    print(PaymentsType.valueOf("PAID"))
    print(PaymentsType.valueOf("PAID").isPayable())
}
