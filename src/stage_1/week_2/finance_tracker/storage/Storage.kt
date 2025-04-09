package stage_1.week_2.finance_tracker.storage

import stage_1.week_2.finance_tracker.transactions.Transaction
import java.util.*

interface Storage {
    fun add(transaction: Transaction)
    fun edit(id: UUID, edited: Transaction): Boolean
    fun delete(id: UUID): Boolean
    fun getAll(): List<Transaction>
}