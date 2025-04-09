package stage_1.week_2.solo_finance_tracker

import java.time.LocalDate
import java.time.YearMonth
import java.util.*

fun main() {/*
    val storage = InMemoryAccount()
    val transactionManager = TransactionManager(storage)
    val report = Report(storage)

    while (true) {
        println("""
            === Personal Finance Tracker ===
            1. Add Transaction
            2. View Transactions
            3. Edit Transaction
            4. Delete Transaction
            5. Monthly Summary
            6. Balance Report
            7. Exit
        """.trimIndent())

        when (readln()) {
            "1" -> {
                println("Amount:")
                val amount = readln().toDouble()

                println("Date (YYYY-MM-DD):")
                val date = LocalDate.parse(readln())

                println("Category:")
                val category = readln()

                println("Type (INCOME/EXPENSE):")
                val type = TransactionType.valueOf(readln().uppercase())

                transactionManager.addTransaction(Transaction(amount = amount, date = date, category = category, type = type))
                println("Transaction added.")
            }
            "2" -> {
                println("Transactions:")
                transactionManager.getAllTransactions().forEach { println(it) }
            }
            "3" -> {
                println("Enter Transaction ID to edit:")
                val id = UUID.fromString(readln())
                println("New Amount:")
                val amount = readln().toDouble()
                println("New Date (YYYY-MM-DD):")
                val date = LocalDate.parse(readln())
                println("New Category:")
                val category = readln()
                println("New Type (INCOME/EXPENSE):")
                val type = TransactionType.valueOf(readln().uppercase())
                val updated = Transaction(id = id, amount = amount, date = date, category = category, type = type)
                if (transactionManager.editTransaction(id, updated)) println("Updated.") else println("Transaction not found.")
            }
            "4" -> {
                println("Enter Transaction ID to delete:")
                val id = UUID.fromString(readln())
                if (transactionManager.deleteTransaction(id)) println("Deleted.") else println("Transaction not found.")
            }
            "5" -> {
                println("Enter month (YYYY-MM):")
                val ym = YearMonth.parse(readln())
                val summary = report.getMonthlySummary(ym)
                summary.forEach { (category, total) -> println("$category: $total") }
            }
            "6" -> println("Balance: ${report.getBalance()}")
            "7" -> return
            else -> println("Invalid option.")
        }
    }*/
}
