package stage_1.week_2.solo2

import java.time.YearMonth

interface TransactionsSummary {

    fun getBalance(): Double

    fun getMonthlySummary(month: YearMonth): Map<String, Double>

}