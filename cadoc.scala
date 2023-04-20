// Databricks notebook source
val test = "dataset.test"

// COMMAND ----------

// MAGIC %md
// MAGIC # E agora jose

// COMMAND ----------

display(test)

// COMMAND ----------

test.withColumn("aaa", lit("bbb"))

val abc = 123
