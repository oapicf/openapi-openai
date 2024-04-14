#' Create a new TruncationObject
#'
#' @description
#' TruncationObject Class
#'
#' @docType class
#' @title TruncationObject
#' @description TruncationObject Class
#' @format An \code{R6Class} generator object
#' @field type The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`. character [optional]
#' @field last_messages The number of most recent messages from the thread when constructing the context for the run. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TruncationObject <- R6::R6Class(
  "TruncationObject",
  public = list(
    `type` = NULL,
    `last_messages` = NULL,
    #' Initialize a new TruncationObject class.
    #'
    #' @description
    #' Initialize a new TruncationObject class.
    #'
    #' @param type The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
    #' @param last_messages The number of most recent messages from the thread when constructing the context for the run.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type` = NULL, `last_messages` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c("auto", "last_messages"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"auto\", \"last_messages\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`last_messages`)) {
        if (!(is.numeric(`last_messages`) && length(`last_messages`) == 1)) {
          stop(paste("Error! Invalid data for `last_messages`. Must be an integer:", `last_messages`))
        }
        self$`last_messages` <- `last_messages`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TruncationObject in JSON format
    #' @export
    toJSON = function() {
      TruncationObjectObject <- list()
      if (!is.null(self$`type`)) {
        TruncationObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`last_messages`)) {
        TruncationObjectObject[["last_messages"]] <-
          self$`last_messages`
      }
      TruncationObjectObject
    },
    #' Deserialize JSON string into an instance of TruncationObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of TruncationObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of TruncationObject
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("auto", "last_messages"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"auto\", \"last_messages\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`last_messages`)) {
        self$`last_messages` <- this_object$`last_messages`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TruncationObject in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        },
        if (!is.null(self$`last_messages`)) {
          sprintf(
          '"last_messages":
            %d
                    ',
          self$`last_messages`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of TruncationObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of TruncationObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of TruncationObject
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("auto", "last_messages"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"auto\", \"last_messages\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`last_messages` <- this_object$`last_messages`
      self
    },
    #' Validate JSON input with respect to TruncationObject
    #'
    #' @description
    #' Validate JSON input with respect to TruncationObject and throw an exception if invalid
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
    #' @return String representation of TruncationObject
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
      if (self$`last_messages` < 1) {
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
      if (self$`last_messages` < 1) {
        invalid_fields["last_messages"] <- "Invalid value for `last_messages`, must be bigger than or equal to 1."
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
# TruncationObject$unlock()
#
## Below is an example to define the print function
# TruncationObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TruncationObject$lock()

