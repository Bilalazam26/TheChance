package stage_1.week_2.finance_tracker.summary

import java.time.YearMonth

interface TransactionsSummary {

    fun getBalance(): Double

    fun getMonthlySummary(month: YearMonth): Map<String, Double>

}