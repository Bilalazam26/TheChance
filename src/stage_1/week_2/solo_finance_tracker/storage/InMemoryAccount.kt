package stage_1.week_2.solo_finance_tracker.storage

import java.util.*
/*


class InMemoryAccount : Storage {
    private val transactions = mutableListOf<Transaction>()

    override fun add(transaction: Transaction) {
        transactions.add(transaction)
    }

    override fun edit(id: UUID, edited: Transaction): Boolean {
        val index = transactions.indexOfFirst { it.id == id }
        if (index == -1) return false
        transactions[index] = edited.copy(id = id)
        return true
    }

    override fun delete(id: UUID): Boolean = transactions.removeIf { it.id == id }

    override fun getAll(): List<Transaction> = transactions.toList()
}
*/
