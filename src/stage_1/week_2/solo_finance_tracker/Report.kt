package stage_1.week_2.solo_finance_tracker

import java.time.YearMonth
/*

class Report(private val storage: Storage) {
    fun getMonthlySummary(month: YearMonth): Map<String, Double> {
        val transactions = storage.getAll()
        return transactions
            .filter { YearMonth.from(it.date) == month }
            .groupBy { it.category }
            .mapValues { entry ->
                entry.value.sumOf { if (it.type == TransactionType.EXPENSE) -it.amount else it.amount }
            }
    }

    fun getBalance(): Double =
        storage.getAll().sumOf { if (it.type == TransactionType.EXPENSE) -it.amount else it.amount }
}*/
