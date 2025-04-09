package recap

interface CashPay {
    fun pay() {
        println("pay")
        calcFees()
    }
    fun calcFees(){
        println("calcFees")
    }
}


class VCashPay: CashPay {
    override fun calcFees() {
        println("calcVcashFees")
    }
    override fun pay() {
        super.pay()
        println("payVcashFees")
    }
}

class ECashPay: CashPay {
    override fun calcFees() {
        println("calcEcashFees")
    }
    override fun pay() {
        super.pay()
        println("payEcashFees")
    }
}