#' Create a new MessageObjectIncompleteDetails
#'
#' @description
#' On an incomplete message, details about why the message is incomplete.
#'
#' @docType class
#' @title MessageObjectIncompleteDetails
#' @description MessageObjectIncompleteDetails Class
#' @format An \code{R6Class} generator object
#' @field reason The reason the message is incomplete. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageObjectIncompleteDetails <- R6::R6Class(
  "MessageObjectIncompleteDetails",
  public = list(
    `reason` = NULL,

    #' @description
    #' Initialize a new MessageObjectIncompleteDetails class.
    #'
    #' @param reason The reason the message is incomplete.
    #' @param ... Other optional arguments.
    initialize = function(`reason`, ...) {
      if (!missing(`reason`)) {
        if (!(`reason` %in% c("content_filter", "max_tokens", "run_cancelled", "run_expired", "run_failed"))) {
          stop(paste("Error! \"", `reason`, "\" cannot be assigned to `reason`. Must be \"content_filter\", \"max_tokens\", \"run_cancelled\", \"run_expired\", \"run_failed\".", sep = ""))
        }
        if (!(is.character(`reason`) && length(`reason`) == 1)) {
          stop(paste("Error! Invalid data for `reason`. Must be a string:", `reason`))
        }
        self$`reason` <- `reason`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return MessageObjectIncompleteDetails in JSON format
    toJSON = function() {
      MessageObjectIncompleteDetailsObject <- list()
      if (!is.null(self$`reason`)) {
        MessageObjectIncompleteDetailsObject[["reason"]] <-
          self$`reason`
      }
      MessageObjectIncompleteDetailsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageObjectIncompleteDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageObjectIncompleteDetails
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`reason`)) {
        if (!is.null(this_object$`reason`) && !(this_object$`reason` %in% c("content_filter", "max_tokens", "run_cancelled", "run_expired", "run_failed"))) {
          stop(paste("Error! \"", this_object$`reason`, "\" cannot be assigned to `reason`. Must be \"content_filter\", \"max_tokens\", \"run_cancelled\", \"run_expired\", \"run_failed\".", sep = ""))
        }
        self$`reason` <- this_object$`reason`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return MessageObjectIncompleteDetails in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`reason`)) {
          sprintf(
          '"reason":
            "%s"
                    ',
          self$`reason`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageObjectIncompleteDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageObjectIncompleteDetails
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`reason`) && !(this_object$`reason` %in% c("content_filter", "max_tokens", "run_cancelled", "run_expired", "run_failed"))) {
        stop(paste("Error! \"", this_object$`reason`, "\" cannot be assigned to `reason`. Must be \"content_filter\", \"max_tokens\", \"run_cancelled\", \"run_expired\", \"run_failed\".", sep = ""))
      }
      self$`reason` <- this_object$`reason`
      self
    },

    #' @description
    #' Validate JSON input with respect to MessageObjectIncompleteDetails and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `reason`
      if (!is.null(input_json$`reason`)) {
        if (!(is.character(input_json$`reason`) && length(input_json$`reason`) == 1)) {
          stop(paste("Error! Invalid data for `reason`. Must be a string:", input_json$`reason`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageObjectIncompleteDetails: the required field `reason` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageObjectIncompleteDetails
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `reason` is null
      if (is.null(self$`reason`)) {
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
      # check if the required `reason` is null
      if (is.null(self$`reason`)) {
        invalid_fields["reason"] <- "Non-nullable required field `reason` cannot be null."
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
# MessageObjectIncompleteDetails$unlock()
#
## Below is an example to define the print function
# MessageObjectIncompleteDetails$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageObjectIncompleteDetails$lock()

