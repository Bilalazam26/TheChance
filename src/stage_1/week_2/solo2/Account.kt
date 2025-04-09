package stage_1.week_2.solo2

import java.util.*


class Account : TransactionManager {
    private val transactions = mutableListOf<Transaction>()

    override fun addTransaction(transaction: Transaction) {
        transactions.add(transaction)
    }

    override fun editTransaction(id: UUID, editedTransaction: Transaction): Boolean {
        val index = transactions.indexOfFirst { it.id == id }
        if (index == -1) return false
        transactions[index] = editedTransaction.copy(id = id)
        return true
    }

    override fun deleteTransaction(id: UUID): Boolean = transactions.removeIf { it.id == id }

    override fun getAllTransactions(): List<Transaction> = transactions.toList()
}
