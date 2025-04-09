package stage_1.week_2.solo2

import java.time.YearMonth

class Report(private val transactionManager: TransactionManager): TransactionsSummary {
    override fun getMonthlySummary(month: YearMonth): Map<String, Double> {
        val transactions = transactionManager.getAllTransactions()
        return transactions
            .filter { YearMonth.from(it.date) == month }
            .groupBy { it.category }
            .mapValues { entry ->
                entry.value.sumOf { if (it.type == TransactionType.EXPENSE) -it.amount else it.amount }
            }
    }

    override fun getBalance(): Double =
        transactionManager.getAllTransactions().sumOf { if (it.type == TransactionType.EXPENSE) -it.amount else it.amount }
}