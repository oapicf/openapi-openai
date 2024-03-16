#' Create a new CreateEditResponseChoicesInner
#'
#' @description
#' CreateEditResponseChoicesInner Class
#'
#' @docType class
#' @title CreateEditResponseChoicesInner
#' @description CreateEditResponseChoicesInner Class
#' @format An \code{R6Class} generator object
#' @field text  character [optional]
#' @field index  integer [optional]
#' @field logprobs  \link{CreateCompletionResponseChoicesInnerLogprobs} [optional]
#' @field finish_reason  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateEditResponseChoicesInner <- R6::R6Class(
  "CreateEditResponseChoicesInner",
  public = list(
    `text` = NULL,
    `index` = NULL,
    `logprobs` = NULL,
    `finish_reason` = NULL,
    #' Initialize a new CreateEditResponseChoicesInner class.
    #'
    #' @description
    #' Initialize a new CreateEditResponseChoicesInner class.
    #'
    #' @param text text
    #' @param index index
    #' @param logprobs logprobs
    #' @param finish_reason finish_reason
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`text` = NULL, `index` = NULL, `logprobs` = NULL, `finish_reason` = NULL, ...) {
      if (!is.null(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
      }
      if (!is.null(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
      }
      if (!is.null(`logprobs`)) {
        stopifnot(R6::is.R6(`logprobs`))
        self$`logprobs` <- `logprobs`
      }
      if (!is.null(`finish_reason`)) {
        if (!(`finish_reason` %in% c("stop", "length"))) {
          stop(paste("Error! \"", `finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\".", sep = ""))
        }
        if (!(is.character(`finish_reason`) && length(`finish_reason`) == 1)) {
          stop(paste("Error! Invalid data for `finish_reason`. Must be a string:", `finish_reason`))
        }
        self$`finish_reason` <- `finish_reason`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateEditResponseChoicesInner in JSON format
    #' @export
    toJSON = function() {
      CreateEditResponseChoicesInnerObject <- list()
      if (!is.null(self$`text`)) {
        CreateEditResponseChoicesInnerObject[["text"]] <-
          self$`text`
      }
      if (!is.null(self$`index`)) {
        CreateEditResponseChoicesInnerObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`logprobs`)) {
        CreateEditResponseChoicesInnerObject[["logprobs"]] <-
          self$`logprobs`$toJSON()
      }
      if (!is.null(self$`finish_reason`)) {
        CreateEditResponseChoicesInnerObject[["finish_reason"]] <-
          self$`finish_reason`
      }
      CreateEditResponseChoicesInnerObject
    },
    #' Deserialize JSON string into an instance of CreateEditResponseChoicesInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateEditResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateEditResponseChoicesInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      if (!is.null(this_object$`logprobs`)) {
        `logprobs_object` <- CreateCompletionResponseChoicesInnerLogprobs$new()
        `logprobs_object`$fromJSON(jsonlite::toJSON(this_object$`logprobs`, auto_unbox = TRUE, digits = NA))
        self$`logprobs` <- `logprobs_object`
      }
      if (!is.null(this_object$`finish_reason`)) {
        if (!is.null(this_object$`finish_reason`) && !(this_object$`finish_reason` %in% c("stop", "length"))) {
          stop(paste("Error! \"", this_object$`finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\".", sep = ""))
        }
        self$`finish_reason` <- this_object$`finish_reason`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateEditResponseChoicesInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`text`)) {
          sprintf(
          '"text":
            "%s"
                    ',
          self$`text`
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
        if (!is.null(self$`finish_reason`)) {
          sprintf(
          '"finish_reason":
            "%s"
                    ',
          self$`finish_reason`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateEditResponseChoicesInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateEditResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateEditResponseChoicesInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`text` <- this_object$`text`
      self$`index` <- this_object$`index`
      self$`logprobs` <- CreateCompletionResponseChoicesInnerLogprobs$new()$fromJSON(jsonlite::toJSON(this_object$`logprobs`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`finish_reason`) && !(this_object$`finish_reason` %in% c("stop", "length"))) {
        stop(paste("Error! \"", this_object$`finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\".", sep = ""))
      }
      self$`finish_reason` <- this_object$`finish_reason`
      self
    },
    #' Validate JSON input with respect to CreateEditResponseChoicesInner
    #'
    #' @description
    #' Validate JSON input with respect to CreateEditResponseChoicesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateEditResponseChoicesInner
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
# CreateEditResponseChoicesInner$unlock()
#
## Below is an example to define the print function
# CreateEditResponseChoicesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateEditResponseChoicesInner$lock()

