#' Create a new RunStepDeltaObjectDelta
#'
#' @description
#' The delta containing the fields that have changed on the run step.
#'
#' @docType class
#' @title RunStepDeltaObjectDelta
#' @description RunStepDeltaObjectDelta Class
#' @format An \code{R6Class} generator object
#' @field step_details  \link{RunStepDeltaObjectDeltaStepDetails} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDeltaObjectDelta <- R6::R6Class(
  "RunStepDeltaObjectDelta",
  public = list(
    `step_details` = NULL,

    #' @description
    #' Initialize a new RunStepDeltaObjectDelta class.
    #'
    #' @param step_details step_details
    #' @param ... Other optional arguments.
    initialize = function(`step_details` = NULL, ...) {
      if (!is.null(`step_details`)) {
        stopifnot(R6::is.R6(`step_details`))
        self$`step_details` <- `step_details`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunStepDeltaObjectDelta in JSON format
    toJSON = function() {
      RunStepDeltaObjectDeltaObject <- list()
      if (!is.null(self$`step_details`)) {
        RunStepDeltaObjectDeltaObject[["step_details"]] <-
          self$`step_details`$toJSON()
      }
      RunStepDeltaObjectDeltaObject
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaObjectDelta
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaObjectDelta
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`step_details`)) {
        `step_details_object` <- RunStepDeltaObjectDeltaStepDetails$new()
        `step_details_object`$fromJSON(jsonlite::toJSON(this_object$`step_details`, auto_unbox = TRUE, digits = NA))
        self$`step_details` <- `step_details_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunStepDeltaObjectDelta in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`step_details`)) {
          sprintf(
          '"step_details":
          %s
          ',
          jsonlite::toJSON(self$`step_details`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaObjectDelta
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaObjectDelta
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`step_details` <- RunStepDeltaObjectDeltaStepDetails$new()$fromJSON(jsonlite::toJSON(this_object$`step_details`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDeltaObjectDelta and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDeltaObjectDelta
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# RunStepDeltaObjectDelta$unlock()
#
## Below is an example to define the print function
# RunStepDeltaObjectDelta$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDeltaObjectDelta$lock()

