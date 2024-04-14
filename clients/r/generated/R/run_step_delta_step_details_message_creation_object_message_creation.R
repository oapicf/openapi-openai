#' Create a new RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
#'
#' @description
#' RunStepDeltaStepDetailsMessageCreationObjectMessageCreation Class
#'
#' @docType class
#' @title RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
#' @description RunStepDeltaStepDetailsMessageCreationObjectMessageCreation Class
#' @format An \code{R6Class} generator object
#' @field message_id The ID of the message that was created by this run step. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDeltaStepDetailsMessageCreationObjectMessageCreation <- R6::R6Class(
  "RunStepDeltaStepDetailsMessageCreationObjectMessageCreation",
  public = list(
    `message_id` = NULL,
    #' Initialize a new RunStepDeltaStepDetailsMessageCreationObjectMessageCreation class.
    #'
    #' @description
    #' Initialize a new RunStepDeltaStepDetailsMessageCreationObjectMessageCreation class.
    #'
    #' @param message_id The ID of the message that was created by this run step.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`message_id` = NULL, ...) {
      if (!is.null(`message_id`)) {
        if (!(is.character(`message_id`) && length(`message_id`) == 1)) {
          stop(paste("Error! Invalid data for `message_id`. Must be a string:", `message_id`))
        }
        self$`message_id` <- `message_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepDeltaStepDetailsMessageCreationObjectMessageCreation in JSON format
    #' @export
    toJSON = function() {
      RunStepDeltaStepDetailsMessageCreationObjectMessageCreationObject <- list()
      if (!is.null(self$`message_id`)) {
        RunStepDeltaStepDetailsMessageCreationObjectMessageCreationObject[["message_id"]] <-
          self$`message_id`
      }
      RunStepDeltaStepDetailsMessageCreationObjectMessageCreationObject
    },
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`message_id`)) {
        self$`message_id` <- this_object$`message_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepDeltaStepDetailsMessageCreationObjectMessageCreation in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`message_id`)) {
          sprintf(
          '"message_id":
            "%s"
                    ',
          self$`message_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`message_id` <- this_object$`message_id`
      self
    },
    #' Validate JSON input with respect to RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    #'
    #' @description
    #' Validate JSON input with respect to RunStepDeltaStepDetailsMessageCreationObjectMessageCreation and throw an exception if invalid
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
    #' @return String representation of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
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
# RunStepDeltaStepDetailsMessageCreationObjectMessageCreation$unlock()
#
## Below is an example to define the print function
# RunStepDeltaStepDetailsMessageCreationObjectMessageCreation$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDeltaStepDetailsMessageCreationObjectMessageCreation$lock()

