#' Create a new TranscriptionSegment
#'
#' @description
#' TranscriptionSegment Class
#'
#' @docType class
#' @title TranscriptionSegment
#' @description TranscriptionSegment Class
#' @format An \code{R6Class} generator object
#' @field id Unique identifier of the segment. integer
#' @field seek Seek offset of the segment. integer
#' @field start Start time of the segment in seconds. numeric
#' @field end End time of the segment in seconds. numeric
#' @field text Text content of the segment. character
#' @field tokens Array of token IDs for the text content. list(integer)
#' @field temperature Temperature parameter used for generating the segment. numeric
#' @field avg_logprob Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. numeric
#' @field compression_ratio Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. numeric
#' @field no_speech_prob Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent. numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TranscriptionSegment <- R6::R6Class(
  "TranscriptionSegment",
  public = list(
    `id` = NULL,
    `seek` = NULL,
    `start` = NULL,
    `end` = NULL,
    `text` = NULL,
    `tokens` = NULL,
    `temperature` = NULL,
    `avg_logprob` = NULL,
    `compression_ratio` = NULL,
    `no_speech_prob` = NULL,

    #' @description
    #' Initialize a new TranscriptionSegment class.
    #'
    #' @param id Unique identifier of the segment.
    #' @param seek Seek offset of the segment.
    #' @param start Start time of the segment in seconds.
    #' @param end End time of the segment in seconds.
    #' @param text Text content of the segment.
    #' @param tokens Array of token IDs for the text content.
    #' @param temperature Temperature parameter used for generating the segment.
    #' @param avg_logprob Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
    #' @param compression_ratio Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
    #' @param no_speech_prob Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `seek`, `start`, `end`, `text`, `tokens`, `temperature`, `avg_logprob`, `compression_ratio`, `no_speech_prob`, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`seek`)) {
        if (!(is.numeric(`seek`) && length(`seek`) == 1)) {
          stop(paste("Error! Invalid data for `seek`. Must be an integer:", `seek`))
        }
        self$`seek` <- `seek`
      }
      if (!missing(`start`)) {
        if (!(is.numeric(`start`) && length(`start`) == 1)) {
          stop(paste("Error! Invalid data for `start`. Must be a number:", `start`))
        }
        self$`start` <- `start`
      }
      if (!missing(`end`)) {
        if (!(is.numeric(`end`) && length(`end`) == 1)) {
          stop(paste("Error! Invalid data for `end`. Must be a number:", `end`))
        }
        self$`end` <- `end`
      }
      if (!missing(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
      }
      if (!missing(`tokens`)) {
        stopifnot(is.vector(`tokens`), length(`tokens`) != 0)
        sapply(`tokens`, function(x) stopifnot(is.character(x)))
        self$`tokens` <- `tokens`
      }
      if (!missing(`temperature`)) {
        if (!(is.numeric(`temperature`) && length(`temperature`) == 1)) {
          stop(paste("Error! Invalid data for `temperature`. Must be a number:", `temperature`))
        }
        self$`temperature` <- `temperature`
      }
      if (!missing(`avg_logprob`)) {
        if (!(is.numeric(`avg_logprob`) && length(`avg_logprob`) == 1)) {
          stop(paste("Error! Invalid data for `avg_logprob`. Must be a number:", `avg_logprob`))
        }
        self$`avg_logprob` <- `avg_logprob`
      }
      if (!missing(`compression_ratio`)) {
        if (!(is.numeric(`compression_ratio`) && length(`compression_ratio`) == 1)) {
          stop(paste("Error! Invalid data for `compression_ratio`. Must be a number:", `compression_ratio`))
        }
        self$`compression_ratio` <- `compression_ratio`
      }
      if (!missing(`no_speech_prob`)) {
        if (!(is.numeric(`no_speech_prob`) && length(`no_speech_prob`) == 1)) {
          stop(paste("Error! Invalid data for `no_speech_prob`. Must be a number:", `no_speech_prob`))
        }
        self$`no_speech_prob` <- `no_speech_prob`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return TranscriptionSegment as a base R list.
    #' @examples
    #' # convert array of TranscriptionSegment (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert TranscriptionSegment to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TranscriptionSegmentObject <- list()
      if (!is.null(self$`id`)) {
        TranscriptionSegmentObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`seek`)) {
        TranscriptionSegmentObject[["seek"]] <-
          self$`seek`
      }
      if (!is.null(self$`start`)) {
        TranscriptionSegmentObject[["start"]] <-
          self$`start`
      }
      if (!is.null(self$`end`)) {
        TranscriptionSegmentObject[["end"]] <-
          self$`end`
      }
      if (!is.null(self$`text`)) {
        TranscriptionSegmentObject[["text"]] <-
          self$`text`
      }
      if (!is.null(self$`tokens`)) {
        TranscriptionSegmentObject[["tokens"]] <-
          self$`tokens`
      }
      if (!is.null(self$`temperature`)) {
        TranscriptionSegmentObject[["temperature"]] <-
          self$`temperature`
      }
      if (!is.null(self$`avg_logprob`)) {
        TranscriptionSegmentObject[["avg_logprob"]] <-
          self$`avg_logprob`
      }
      if (!is.null(self$`compression_ratio`)) {
        TranscriptionSegmentObject[["compression_ratio"]] <-
          self$`compression_ratio`
      }
      if (!is.null(self$`no_speech_prob`)) {
        TranscriptionSegmentObject[["no_speech_prob"]] <-
          self$`no_speech_prob`
      }
      return(TranscriptionSegmentObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TranscriptionSegment
    #'
    #' @param input_json the JSON input
    #' @return the instance of TranscriptionSegment
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`seek`)) {
        self$`seek` <- this_object$`seek`
      }
      if (!is.null(this_object$`start`)) {
        self$`start` <- this_object$`start`
      }
      if (!is.null(this_object$`end`)) {
        self$`end` <- this_object$`end`
      }
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      if (!is.null(this_object$`tokens`)) {
        self$`tokens` <- ApiClient$new()$deserializeObj(this_object$`tokens`, "array[integer]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`temperature`)) {
        self$`temperature` <- this_object$`temperature`
      }
      if (!is.null(this_object$`avg_logprob`)) {
        self$`avg_logprob` <- this_object$`avg_logprob`
      }
      if (!is.null(this_object$`compression_ratio`)) {
        self$`compression_ratio` <- this_object$`compression_ratio`
      }
      if (!is.null(this_object$`no_speech_prob`)) {
        self$`no_speech_prob` <- this_object$`no_speech_prob`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TranscriptionSegment in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TranscriptionSegment
    #'
    #' @param input_json the JSON input
    #' @return the instance of TranscriptionSegment
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`seek` <- this_object$`seek`
      self$`start` <- this_object$`start`
      self$`end` <- this_object$`end`
      self$`text` <- this_object$`text`
      self$`tokens` <- ApiClient$new()$deserializeObj(this_object$`tokens`, "array[integer]", loadNamespace("openapi"))
      self$`temperature` <- this_object$`temperature`
      self$`avg_logprob` <- this_object$`avg_logprob`
      self$`compression_ratio` <- this_object$`compression_ratio`
      self$`no_speech_prob` <- this_object$`no_speech_prob`
      self
    },

    #' @description
    #' Validate JSON input with respect to TranscriptionSegment and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.numeric(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TranscriptionSegment: the required field `id` is missing."))
      }
      # check the required field `seek`
      if (!is.null(input_json$`seek`)) {
        if (!(is.numeric(input_json$`seek`) && length(input_json$`seek`) == 1)) {
          stop(paste("Error! Invalid data for `seek`. Must be an integer:", input_json$`seek`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TranscriptionSegment: the required field `seek` is missing."))
      }
      # check the required field `start`
      if (!is.null(input_json$`start`)) {
        if (!(is.numeric(input_json$`start`) && length(input_json$`start`) == 1)) {
          stop(paste("Error! Invalid data for `start`. Must be a number:", input_json$`start`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TranscriptionSegment: the required field `start` is missing."))
      }
      # check the required field `end`
      if (!is.null(input_json$`end`)) {
        if (!(is.numeric(input_json$`end`) && length(input_json$`end`) == 1)) {
          stop(paste("Error! Invalid data for `end`. Must be a number:", input_json$`end`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TranscriptionSegment: the required field `end` is missing."))
      }
      # check the required field `text`
      if (!is.null(input_json$`text`)) {
        if (!(is.character(input_json$`text`) && length(input_json$`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", input_json$`text`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TranscriptionSegment: the required field `text` is missing."))
      }
      # check the required field `tokens`
      if (!is.null(input_json$`tokens`)) {
        stopifnot(is.vector(input_json$`tokens`), length(input_json$`tokens`) != 0)
        tmp <- sapply(input_json$`tokens`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TranscriptionSegment: the required field `tokens` is missing."))
      }
      # check the required field `temperature`
      if (!is.null(input_json$`temperature`)) {
        if (!(is.numeric(input_json$`temperature`) && length(input_json$`temperature`) == 1)) {
          stop(paste("Error! Invalid data for `temperature`. Must be a number:", input_json$`temperature`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TranscriptionSegment: the required field `temperature` is missing."))
      }
      # check the required field `avg_logprob`
      if (!is.null(input_json$`avg_logprob`)) {
        if (!(is.numeric(input_json$`avg_logprob`) && length(input_json$`avg_logprob`) == 1)) {
          stop(paste("Error! Invalid data for `avg_logprob`. Must be a number:", input_json$`avg_logprob`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TranscriptionSegment: the required field `avg_logprob` is missing."))
      }
      # check the required field `compression_ratio`
      if (!is.null(input_json$`compression_ratio`)) {
        if (!(is.numeric(input_json$`compression_ratio`) && length(input_json$`compression_ratio`) == 1)) {
          stop(paste("Error! Invalid data for `compression_ratio`. Must be a number:", input_json$`compression_ratio`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TranscriptionSegment: the required field `compression_ratio` is missing."))
      }
      # check the required field `no_speech_prob`
      if (!is.null(input_json$`no_speech_prob`)) {
        if (!(is.numeric(input_json$`no_speech_prob`) && length(input_json$`no_speech_prob`) == 1)) {
          stop(paste("Error! Invalid data for `no_speech_prob`. Must be a number:", input_json$`no_speech_prob`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TranscriptionSegment: the required field `no_speech_prob` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TranscriptionSegment
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `seek` is null
      if (is.null(self$`seek`)) {
        return(FALSE)
      }

      # check if the required `start` is null
      if (is.null(self$`start`)) {
        return(FALSE)
      }

      # check if the required `end` is null
      if (is.null(self$`end`)) {
        return(FALSE)
      }

      # check if the required `text` is null
      if (is.null(self$`text`)) {
        return(FALSE)
      }

      # check if the required `tokens` is null
      if (is.null(self$`tokens`)) {
        return(FALSE)
      }

      # check if the required `temperature` is null
      if (is.null(self$`temperature`)) {
        return(FALSE)
      }

      # check if the required `avg_logprob` is null
      if (is.null(self$`avg_logprob`)) {
        return(FALSE)
      }

      # check if the required `compression_ratio` is null
      if (is.null(self$`compression_ratio`)) {
        return(FALSE)
      }

      # check if the required `no_speech_prob` is null
      if (is.null(self$`no_speech_prob`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `seek` is null
      if (is.null(self$`seek`)) {
        invalid_fields["seek"] <- "Non-nullable required field `seek` cannot be null."
      }

      # check if the required `start` is null
      if (is.null(self$`start`)) {
        invalid_fields["start"] <- "Non-nullable required field `start` cannot be null."
      }

      # check if the required `end` is null
      if (is.null(self$`end`)) {
        invalid_fields["end"] <- "Non-nullable required field `end` cannot be null."
      }

      # check if the required `text` is null
      if (is.null(self$`text`)) {
        invalid_fields["text"] <- "Non-nullable required field `text` cannot be null."
      }

      # check if the required `tokens` is null
      if (is.null(self$`tokens`)) {
        invalid_fields["tokens"] <- "Non-nullable required field `tokens` cannot be null."
      }

      # check if the required `temperature` is null
      if (is.null(self$`temperature`)) {
        invalid_fields["temperature"] <- "Non-nullable required field `temperature` cannot be null."
      }

      # check if the required `avg_logprob` is null
      if (is.null(self$`avg_logprob`)) {
        invalid_fields["avg_logprob"] <- "Non-nullable required field `avg_logprob` cannot be null."
      }

      # check if the required `compression_ratio` is null
      if (is.null(self$`compression_ratio`)) {
        invalid_fields["compression_ratio"] <- "Non-nullable required field `compression_ratio` cannot be null."
      }

      # check if the required `no_speech_prob` is null
      if (is.null(self$`no_speech_prob`)) {
        invalid_fields["no_speech_prob"] <- "Non-nullable required field `no_speech_prob` cannot be null."
      }

      invalid_fields
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
# TranscriptionSegment$unlock()
#
## Below is an example to define the print function
# TranscriptionSegment$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TranscriptionSegment$lock()

