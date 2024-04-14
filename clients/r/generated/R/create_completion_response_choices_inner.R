#' Create a new CreateCompletionResponseChoicesInner
#'
#' @description
#' CreateCompletionResponseChoicesInner Class
#'
#' @docType class
#' @title CreateCompletionResponseChoicesInner
#' @description CreateCompletionResponseChoicesInner Class
#' @format An \code{R6Class} generator object
#' @field finish_reason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. character
#' @field index  integer
#' @field logprobs  \link{CreateCompletionResponseChoicesInnerLogprobs}
#' @field text  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateCompletionResponseChoicesInner <- R6::R6Class(
  "CreateCompletionResponseChoicesInner",
  public = list(
    `finish_reason` = NULL,
    `index` = NULL,
    `logprobs` = NULL,
    `text` = NULL,
    #' Initialize a new CreateCompletionResponseChoicesInner class.
    #'
    #' @description
    #' Initialize a new CreateCompletionResponseChoicesInner class.
    #'
    #' @param finish_reason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters.
    #' @param index index
    #' @param logprobs logprobs
    #' @param text text
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`finish_reason`, `index`, `logprobs`, `text`, ...) {
      if (!missing(`finish_reason`)) {
        if (!(`finish_reason` %in% c("stop", "length", "content_filter"))) {
          stop(paste("Error! \"", `finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"content_filter\".", sep = ""))
        }
        if (!(is.character(`finish_reason`) && length(`finish_reason`) == 1)) {
          stop(paste("Error! Invalid data for `finish_reason`. Must be a string:", `finish_reason`))
        }
        self$`finish_reason` <- `finish_reason`
      }
      if (!missing(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
      }
      if (!missing(`logprobs`)) {
        stopifnot(R6::is.R6(`logprobs`))
        self$`logprobs` <- `logprobs`
      }
      if (!missing(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateCompletionResponseChoicesInner in JSON format
    #' @export
    toJSON = function() {
      CreateCompletionResponseChoicesInnerObject <- list()
      if (!is.null(self$`finish_reason`)) {
        CreateCompletionResponseChoicesInnerObject[["finish_reason"]] <-
          self$`finish_reason`
      }
      if (!is.null(self$`index`)) {
        CreateCompletionResponseChoicesInnerObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`logprobs`)) {
        CreateCompletionResponseChoicesInnerObject[["logprobs"]] <-
          self$`logprobs`$toJSON()
      }
      if (!is.null(self$`text`)) {
        CreateCompletionResponseChoicesInnerObject[["text"]] <-
          self$`text`
      }
      CreateCompletionResponseChoicesInnerObject
    },
    #' Deserialize JSON string into an instance of CreateCompletionResponseChoicesInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateCompletionResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateCompletionResponseChoicesInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`finish_reason`)) {
        if (!is.null(this_object$`finish_reason`) && !(this_object$`finish_reason` %in% c("stop", "length", "content_filter"))) {
          stop(paste("Error! \"", this_object$`finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"content_filter\".", sep = ""))
        }
        self$`finish_reason` <- this_object$`finish_reason`
      }
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      if (!is.null(this_object$`logprobs`)) {
        `logprobs_object` <- CreateCompletionResponseChoicesInnerLogprobs$new()
        `logprobs_object`$fromJSON(jsonlite::toJSON(this_object$`logprobs`, auto_unbox = TRUE, digits = NA))
        self$`logprobs` <- `logprobs_object`
      }
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateCompletionResponseChoicesInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`finish_reason`)) {
          sprintf(
          '"finish_reason":
            "%s"
                    ',
          self$`finish_reason`
          )
        },
        if (!is.null(self$`index`)) {
          sprintf(
          '"index":
            %d
                    ',
          self$`index`
          )
        },
        if (!is.null(self$`logprobs`)) {
          sprintf(
          '"logprobs":
          %s
          ',
          jsonlite::toJSON(self$`logprobs`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`text`)) {
          sprintf(
          '"text":
            "%s"
                    ',
          self$`text`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateCompletionResponseChoicesInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateCompletionResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateCompletionResponseChoicesInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`finish_reason`) && !(this_object$`finish_reason` %in% c("stop", "length", "content_filter"))) {
        stop(paste("Error! \"", this_object$`finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"content_filter\".", sep = ""))
      }
      self$`finish_reason` <- this_object$`finish_reason`
      self$`index` <- this_object$`index`
      self$`logprobs` <- CreateCompletionResponseChoicesInnerLogprobs$new()$fromJSON(jsonlite::toJSON(this_object$`logprobs`, auto_unbox = TRUE, digits = NA))
      self$`text` <- this_object$`text`
      self
    },
    #' Validate JSON input with respect to CreateCompletionResponseChoicesInner
    #'
    #' @description
    #' Validate JSON input with respect to CreateCompletionResponseChoicesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `finish_reason`
      if (!is.null(input_json$`finish_reason`)) {
        if (!(is.character(input_json$`finish_reason`) && length(input_json$`finish_reason`) == 1)) {
          stop(paste("Error! Invalid data for `finish_reason`. Must be a string:", input_json$`finish_reason`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateCompletionResponseChoicesInner: the required field `finish_reason` is missing."))
      }
      # check the required field `index`
      if (!is.null(input_json$`index`)) {
        if (!(is.numeric(input_json$`index`) && length(input_json$`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", input_json$`index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateCompletionResponseChoicesInner: the required field `index` is missing."))
      }
      # check the required field `logprobs`
      if (!is.null(input_json$`logprobs`)) {
        stopifnot(R6::is.R6(input_json$`logprobs`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateCompletionResponseChoicesInner: the required field `logprobs` is missing."))
      }
      # check the required field `text`
      if (!is.null(input_json$`text`)) {
        if (!(is.character(input_json$`text`) && length(input_json$`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", input_json$`text`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateCompletionResponseChoicesInner: the required field `text` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateCompletionResponseChoicesInner
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `finish_reason` is null
      if (is.null(self$`finish_reason`)) {
        return(FALSE)
      }

      # check if the required `index` is null
      if (is.null(self$`index`)) {
        return(FALSE)
      }

      # check if the required `text` is null
      if (is.null(self$`text`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `finish_reason` is null
      if (is.null(self$`finish_reason`)) {
        invalid_fields["finish_reason"] <- "Non-nullable required field `finish_reason` cannot be null."
      }

      # check if the required `index` is null
      if (is.null(self$`index`)) {
        invalid_fields["index"] <- "Non-nullable required field `index` cannot be null."
      }

      # check if the required `text` is null
      if (is.null(self$`text`)) {
        invalid_fields["text"] <- "Non-nullable required field `text` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CreateCompletionResponseChoicesInner$unlock()
#
## Below is an example to define the print function
# CreateCompletionResponseChoicesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateCompletionResponseChoicesInner$lock()

