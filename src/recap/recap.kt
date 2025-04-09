package recap

fun main() {
    var pay: CashPay = VCashPay()
    pay.pay()
    pay = ECashPay()
    pay.pay()
}

