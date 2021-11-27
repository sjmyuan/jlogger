package io.github.sjmyuan.jlogger

import cats.implicits._
import java.time.Instant
import cats.effect.{Sync, Clock}
abstract class Logger[M[_]: Sync, B](printer: Printer[M, B])(implicit
    clock: Clock[M]
) {
  final def info[A: Formatter[*, B]](
      description: String,
      data: (String, A)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.INFO,
    Formatter[String, B].format("description", description),
    Formatter[A, B].format(data._1, data._2)
  )

  final def info[A1: Formatter[*, B], A2: Formatter[*, B]](
      description: String,
      data1: (String, A1),
      data2: (String, A2)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.INFO,
    Formatter[String, B].format("description", description),
    Formatter[A1, B].format(data1._1, data1._2),
    Formatter[A2, B].format(data2._1, data2._2)
  )

  final def info[A1: Formatter[*, B], A2: Formatter[*, B], A3: Formatter[*, B]](
      description: String,
      data1: (String, A1),
      data2: (String, A2),
      data3: (String, A3)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.INFO,
    Formatter[String, B].format("description", description),
    Formatter[A1, B].format(data1._1, data1._2),
    Formatter[A2, B].format(data2._1, data2._2),
    Formatter[A3, B].format(data3._1, data3._2)
  )

  final def info[A1: Formatter[*, B], A2: Formatter[*, B], A3: Formatter[
    *,
    B
  ], A4: Formatter[*, B]](
      description: String,
      data1: (String, A1),
      data2: (String, A2),
      data3: (String, A3),
      data4: (String, A4)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.INFO,
    Formatter[String, B].format("description", description),
    Formatter[A1, B].format(data1._1, data1._2),
    Formatter[A2, B].format(data2._1, data2._2),
    Formatter[A3, B].format(data3._1, data3._2),
    Formatter[A4, B].format(data4._1, data4._2)
  )

  final def info[A1: Formatter[*, B], A2: Formatter[*, B], A3: Formatter[
    *,
    B
  ], A4: Formatter[*, B], A5: Formatter[*, B]](
      description: String,
      data1: (String, A1),
      data2: (String, A2),
      data3: (String, A3),
      data4: (String, A4),
      data5: (String, A5)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.INFO,
    Formatter[String, B].format("description", description),
    Formatter[A1, B].format(data1._1, data1._2),
    Formatter[A2, B].format(data2._1, data2._2),
    Formatter[A3, B].format(data3._1, data3._2),
    Formatter[A4, B].format(data4._1, data4._2),
    Formatter[A5, B].format(data5._1, data5._2)
  )

  final def warn[A: Formatter[*, B]](
      description: String,
      data: (String, A)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.WARNING,
    Formatter[String, B].format("description", description),
    Formatter[A, B].format(data._1, data._2)
  )

  final def warn[A1: Formatter[*, B], A2: Formatter[*, B]](
      description: String,
      data1: (String, A1),
      data2: (String, A2)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.WARNING,
    Formatter[String, B].format("description", description),
    Formatter[A1, B].format(data1._1, data1._2),
    Formatter[A2, B].format(data2._1, data2._2)
  )

  final def warn[A1: Formatter[*, B], A2: Formatter[*, B], A3: Formatter[*, B]](
      description: String,
      data1: (String, A1),
      data2: (String, A2),
      data3: (String, A3)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.WARNING,
    Formatter[String, B].format("description", description),
    Formatter[A1, B].format(data1._1, data1._2),
    Formatter[A2, B].format(data2._1, data2._2),
    Formatter[A3, B].format(data3._1, data3._2)
  )

  final def warn[A1: Formatter[*, B], A2: Formatter[*, B], A3: Formatter[
    *,
    B
  ], A4: Formatter[*, B]](
      description: String,
      data1: (String, A1),
      data2: (String, A2),
      data3: (String, A3),
      data4: (String, A4)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.WARNING,
    Formatter[String, B].format("description", description),
    Formatter[A1, B].format(data1._1, data1._2),
    Formatter[A2, B].format(data2._1, data2._2),
    Formatter[A3, B].format(data3._1, data3._2),
    Formatter[A4, B].format(data4._1, data4._2)
  )

  final def warn[A1: Formatter[*, B], A2: Formatter[*, B], A3: Formatter[
    *,
    B
  ], A4: Formatter[*, B], A5: Formatter[*, B]](
      description: String,
      data1: (String, A1),
      data2: (String, A2),
      data3: (String, A3),
      data4: (String, A4),
      data5: (String, A5)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.WARNING,
    Formatter[String, B].format("description", description),
    Formatter[A1, B].format(data1._1, data1._2),
    Formatter[A2, B].format(data2._1, data2._2),
    Formatter[A3, B].format(data3._1, data3._2),
    Formatter[A4, B].format(data4._1, data4._2),
    Formatter[A5, B].format(data5._1, data5._2)
  )

  final def error[A: Formatter[*, B]](
      description: String,
      data: (String, A)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.ERROR,
    Formatter[String, B].format("description", description),
    Formatter[A, B].format(data._1, data._2)
  )

  final def error[A1: Formatter[*, B], A2: Formatter[*, B]](
      description: String,
      data1: (String, A1),
      data2: (String, A2)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.ERROR,
    Formatter[String, B].format("description", description),
    Formatter[A1, B].format(data1._1, data1._2),
    Formatter[A2, B].format(data2._1, data2._2)
  )

  final def error[A1: Formatter[*, B], A2: Formatter[*, B], A3: Formatter[
    *,
    B
  ]](
      description: String,
      data1: (String, A1),
      data2: (String, A2),
      data3: (String, A3)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.ERROR,
    Formatter[String, B].format("description", description),
    Formatter[A1, B].format(data1._1, data1._2),
    Formatter[A2, B].format(data2._1, data2._2),
    Formatter[A3, B].format(data3._1, data3._2)
  )

  final def error[A1: Formatter[*, B], A2: Formatter[*, B], A3: Formatter[
    *,
    B
  ], A4: Formatter[*, B]](
      description: String,
      data1: (String, A1),
      data2: (String, A2),
      data3: (String, A3),
      data4: (String, A4)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.ERROR,
    Formatter[String, B].format("description", description),
    Formatter[A1, B].format(data1._1, data1._2),
    Formatter[A2, B].format(data2._1, data2._2),
    Formatter[A3, B].format(data3._1, data3._2),
    Formatter[A4, B].format(data4._1, data4._2)
  )

  final def error[A1: Formatter[*, B], A2: Formatter[*, B], A3: Formatter[
    *,
    B
  ], A4: Formatter[*, B], A5: Formatter[*, B]](
      description: String,
      data1: (String, A1),
      data2: (String, A2),
      data3: (String, A3),
      data4: (String, A4),
      data5: (String, A5)
  )(implicit stringFormatter: Formatter[String, B]): M[Unit] = log(
    LogLevel.ERROR,
    Formatter[String, B].format("description", description),
    Formatter[A1, B].format(data1._1, data1._2),
    Formatter[A2, B].format(data2._1, data2._2),
    Formatter[A3, B].format(data3._1, data3._2),
    Formatter[A4, B].format(data4._1, data4._2),
    Formatter[A5, B].format(data5._1, data5._2)
  )

  def generateContent(logLevel: LogLevel, now: Instant, attrs: Seq[B]): B

  final def log(logLevel: LogLevel, attrs: B*): M[Unit] = for {

    now <- clock.realTime
    content <- Sync[M].delay(
      generateContent(
        logLevel,
        Instant.ofEpochMilli(now.toMillis),
        attrs
      )
    )
    _ <- printer.print(logLevel, content)
  } yield ()
}