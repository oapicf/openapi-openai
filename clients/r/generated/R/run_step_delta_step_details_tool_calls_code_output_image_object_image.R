#' Create a new RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
#'
#' @description
#' RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage Class
#'
#' @docType class
#' @title RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
#' @description RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage Class
#' @format An \code{R6Class} generator object
#' @field file_id The [file](/docs/api-reference/files) ID of the image. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage <- R6::R6Class(
  "RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage",
  public = list(
    `file_id` = NULL,
    #' Initialize a new RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage class.
    #'
    #' @description
    #' Initialize a new RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage class.
    #'
    #' @param file_id The [file](/docs/api-reference/files) ID of the image.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`file_id` = NULL, ...) {
      if (!is.null(`file_id`)) {
        if (!(is.character(`file_id`) && length(`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", `file_id`))
        }
        self$`file_id` <- `file_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage in JSON format
    #' @export
    toJSON = function() {
      RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageObject <- list()
      if (!is.null(self$`file_id`)) {
        RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageObject[["file_id"]] <-
          self$`file_id`
      }
      RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageObject
    },
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`file_id`)) {
        self$`file_id` <- this_object$`file_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`file_id`)) {
          sprintf(
          '"file_id":
            "%s"
                    ',
          self$`file_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_id` <- this_object$`file_id`
      self
    },
    #' Validate JSON input with respect to RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
    #'
    #' @description
    #' Validate JSON input with respect to RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage and throw an exception if invalid
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
    #' @return String representation of RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
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
# RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage$unlock()
#
## Below is an example to define the print function
# RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage$lock()

