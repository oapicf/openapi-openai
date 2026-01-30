#' @docType class
#' @title UsageTimeBucketResultInner
#'
#' @description UsageTimeBucketResultInner Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UsageTimeBucketResultInner <- R6::R6Class(
  "UsageTimeBucketResultInner",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CostsResult", "UsageAudioSpeechesResult", "UsageAudioTranscriptionsResult", "UsageCodeInterpreterSessionsResult", "UsageCompletionsResult", "UsageEmbeddingsResult", "UsageImagesResult", "UsageModerationsResult", "UsageVectorStoresResult"),

    #' @description
    #' Initialize a new UsageTimeBucketResultInner.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CostsResult", "UsageAudioSpeechesResult", "UsageAudioTranscriptionsResult", "UsageCodeInterpreterSessionsResult", "UsageCompletionsResult", "UsageEmbeddingsResult", "UsageImagesResult", "UsageModerationsResult", "UsageVectorStoresResult"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CostsResult") {
        self$actual_instance <- instance
        self$actual_type <- "CostsResult"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "UsageAudioSpeechesResult") {
        self$actual_instance <- instance
        self$actual_type <- "UsageAudioSpeechesResult"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "UsageAudioTranscriptionsResult") {
        self$actual_instance <- instance
        self$actual_type <- "UsageAudioTranscriptionsResult"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "UsageCodeInterpreterSessionsResult") {
        self$actual_instance <- instance
        self$actual_type <- "UsageCodeInterpreterSessionsResult"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "UsageCompletionsResult") {
        self$actual_instance <- instance
        self$actual_type <- "UsageCompletionsResult"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "UsageEmbeddingsResult") {
        self$actual_instance <- instance
        self$actual_type <- "UsageEmbeddingsResult"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "UsageImagesResult") {
        self$actual_instance <- instance
        self$actual_type <- "UsageImagesResult"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "UsageModerationsResult") {
        self$actual_instance <- instance
        self$actual_type <- "UsageModerationsResult"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "UsageVectorStoresResult") {
        self$actual_instance <- instance
        self$actual_type <- "UsageVectorStoresResult"
      } else {
        stop(paste("Failed to initialize UsageTimeBucketResultInner with oneOf schemas CostsResult, UsageAudioSpeechesResult, UsageAudioTranscriptionsResult, UsageCodeInterpreterSessionsResult, UsageCompletionsResult, UsageEmbeddingsResult, UsageImagesResult, UsageModerationsResult, UsageVectorStoresResult. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageTimeBucketResultInner.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of UsageTimeBucketResultInner.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageTimeBucketResultInner.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of UsageTimeBucketResultInner.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `UsageCompletionsResult_result` <- tryCatch({
          `UsageCompletionsResult`$public_methods$validateJSON(input)
          `UsageCompletionsResult_instance` <- `UsageCompletionsResult`$new()
          instance <- `UsageCompletionsResult_instance`$fromJSON(input)
          instance_type <- "UsageCompletionsResult"
          matched_schemas <- append(matched_schemas, "UsageCompletionsResult")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`UsageCompletionsResult_result`["error"])) {
        error_messages <- append(error_messages, `UsageCompletionsResult_result`["message"])
      }

      `UsageEmbeddingsResult_result` <- tryCatch({
          `UsageEmbeddingsResult`$public_methods$validateJSON(input)
          `UsageEmbeddingsResult_instance` <- `UsageEmbeddingsResult`$new()
          instance <- `UsageEmbeddingsResult_instance`$fromJSON(input)
          instance_type <- "UsageEmbeddingsResult"
          matched_schemas <- append(matched_schemas, "UsageEmbeddingsResult")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`UsageEmbeddingsResult_result`["error"])) {
        error_messages <- append(error_messages, `UsageEmbeddingsResult_result`["message"])
      }

      `UsageModerationsResult_result` <- tryCatch({
          `UsageModerationsResult`$public_methods$validateJSON(input)
          `UsageModerationsResult_instance` <- `UsageModerationsResult`$new()
          instance <- `UsageModerationsResult_instance`$fromJSON(input)
          instance_type <- "UsageModerationsResult"
          matched_schemas <- append(matched_schemas, "UsageModerationsResult")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`UsageModerationsResult_result`["error"])) {
        error_messages <- append(error_messages, `UsageModerationsResult_result`["message"])
      }

      `UsageImagesResult_result` <- tryCatch({
          `UsageImagesResult`$public_methods$validateJSON(input)
          `UsageImagesResult_instance` <- `UsageImagesResult`$new()
          instance <- `UsageImagesResult_instance`$fromJSON(input)
          instance_type <- "UsageImagesResult"
          matched_schemas <- append(matched_schemas, "UsageImagesResult")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`UsageImagesResult_result`["error"])) {
        error_messages <- append(error_messages, `UsageImagesResult_result`["message"])
      }

      `UsageAudioSpeechesResult_result` <- tryCatch({
          `UsageAudioSpeechesResult`$public_methods$validateJSON(input)
          `UsageAudioSpeechesResult_instance` <- `UsageAudioSpeechesResult`$new()
          instance <- `UsageAudioSpeechesResult_instance`$fromJSON(input)
          instance_type <- "UsageAudioSpeechesResult"
          matched_schemas <- append(matched_schemas, "UsageAudioSpeechesResult")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`UsageAudioSpeechesResult_result`["error"])) {
        error_messages <- append(error_messages, `UsageAudioSpeechesResult_result`["message"])
      }

      `UsageAudioTranscriptionsResult_result` <- tryCatch({
          `UsageAudioTranscriptionsResult`$public_methods$validateJSON(input)
          `UsageAudioTranscriptionsResult_instance` <- `UsageAudioTranscriptionsResult`$new()
          instance <- `UsageAudioTranscriptionsResult_instance`$fromJSON(input)
          instance_type <- "UsageAudioTranscriptionsResult"
          matched_schemas <- append(matched_schemas, "UsageAudioTranscriptionsResult")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`UsageAudioTranscriptionsResult_result`["error"])) {
        error_messages <- append(error_messages, `UsageAudioTranscriptionsResult_result`["message"])
      }

      `UsageVectorStoresResult_result` <- tryCatch({
          `UsageVectorStoresResult`$public_methods$validateJSON(input)
          `UsageVectorStoresResult_instance` <- `UsageVectorStoresResult`$new()
          instance <- `UsageVectorStoresResult_instance`$fromJSON(input)
          instance_type <- "UsageVectorStoresResult"
          matched_schemas <- append(matched_schemas, "UsageVectorStoresResult")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`UsageVectorStoresResult_result`["error"])) {
        error_messages <- append(error_messages, `UsageVectorStoresResult_result`["message"])
      }

      `UsageCodeInterpreterSessionsResult_result` <- tryCatch({
          `UsageCodeInterpreterSessionsResult`$public_methods$validateJSON(input)
          `UsageCodeInterpreterSessionsResult_instance` <- `UsageCodeInterpreterSessionsResult`$new()
          instance <- `UsageCodeInterpreterSessionsResult_instance`$fromJSON(input)
          instance_type <- "UsageCodeInterpreterSessionsResult"
          matched_schemas <- append(matched_schemas, "UsageCodeInterpreterSessionsResult")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`UsageCodeInterpreterSessionsResult_result`["error"])) {
        error_messages <- append(error_messages, `UsageCodeInterpreterSessionsResult_result`["message"])
      }

      `CostsResult_result` <- tryCatch({
          `CostsResult`$public_methods$validateJSON(input)
          `CostsResult_instance` <- `CostsResult`$new()
          instance <- `CostsResult_instance`$fromJSON(input)
          instance_type <- "CostsResult"
          matched_schemas <- append(matched_schemas, "CostsResult")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CostsResult_result`["error"])) {
        error_messages <- append(error_messages, `CostsResult_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into UsageTimeBucketResultInner with oneOf schemas CostsResult, UsageAudioSpeechesResult, UsageAudioTranscriptionsResult, UsageCodeInterpreterSessionsResult, UsageCompletionsResult, UsageEmbeddingsResult, UsageImagesResult, UsageModerationsResult, UsageVectorStoresResult. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into UsageTimeBucketResultInner with oneOf schemas CostsResult, UsageAudioSpeechesResult, UsageAudioTranscriptionsResult, UsageCodeInterpreterSessionsResult, UsageCompletionsResult, UsageEmbeddingsResult, UsageImagesResult, UsageModerationsResult, UsageVectorStoresResult. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize UsageTimeBucketResultInner to JSON string.
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return JSON string representation of the UsageTimeBucketResultInner.
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      if (!is.null(self$actual_instance)) {
        json <- jsonlite::toJSON(simple, auto_unbox = TRUE, ...)
        return(as.character(jsonlite::minify(json)))
      } else {
        return(NULL)
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert UsageTimeBucketResultInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      if (!is.null(self$actual_instance)) {
        return(self$actual_instance$toSimpleType())
      } else {
        return(NULL)
      }
    },

    #' @description
    #' Validate the input JSON with respect to UsageTimeBucketResultInner and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },

    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
#UsageTimeBucketResultInner$unlock()
#
## Below is an example to define the print function
#UsageTimeBucketResultInner$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#UsageTimeBucketResultInner$lock()

