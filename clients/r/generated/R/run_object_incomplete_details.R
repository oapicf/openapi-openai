#' Create a new RunObjectIncompleteDetails
#'
#' @description
#' Details on why the run is incomplete. Will be `null` if the run is not incomplete.
#'
#' @docType class
#' @title RunObjectIncompleteDetails
#' @description RunObjectIncompleteDetails Class
#' @format An \code{R6Class} generator object
#' @field reason The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunObjectIncompleteDetails <- R6::R6Class(
  "RunObjectIncompleteDetails",
  public = list(
    `reason` = NULL,
    #' Initialize a new RunObjectIncompleteDetails class.
    #'
    #' @description
    #' Initialize a new RunObjectIncompleteDetails class.
    #'
    #' @param reason The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`reason` = NULL, ...) {
      if (!is.null(`reason`)) {
        if (!(`reason` %in% c("max_completion_tokens", "max_prompt_tokens"))) {
          stop(paste("Error! \"", `reason`, "\" cannot be assigned to `reason`. Must be \"max_completion_tokens\", \"max_prompt_tokens\".", sep = ""))
        }
        if (!(is.character(`reason`) && length(`reason`) == 1)) {
          stop(paste("Error! Invalid data for `reason`. Must be a string:", `reason`))
        }
        self$`reason` <- `reason`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunObjectIncompleteDetails in JSON format
    #' @export
    toJSON = function() {
      RunObjectIncompleteDetailsObject <- list()
      if (!is.null(self$`reason`)) {
        RunObjectIncompleteDetailsObject[["reason"]] <-
          self$`reason`
      }
      RunObjectIncompleteDetailsObject
    },
    #' Deserialize JSON string into an instance of RunObjectIncompleteDetails
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunObjectIncompleteDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunObjectIncompleteDetails
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`reason`)) {
        if (!is.null(this_object$`reason`) && !(this_object$`reason` %in% c("max_completion_tokens", "max_prompt_tokens"))) {
          stop(paste("Error! \"", this_object$`reason`, "\" cannot be assigned to `reason`. Must be \"max_completion_tokens\", \"max_prompt_tokens\".", sep = ""))
        }
        self$`reason` <- this_object$`reason`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunObjectIncompleteDetails in JSON format
    #' @export
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
    #' Deserialize JSON string into an instance of RunObjectIncompleteDetails
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunObjectIncompleteDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunObjectIncompleteDetails
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`reason`) && !(this_object$`reason` %in% c("max_completion_tokens", "max_prompt_tokens"))) {
        stop(paste("Error! \"", this_object$`reason`, "\" cannot be assigned to `reason`. Must be \"max_completion_tokens\", \"max_prompt_tokens\".", sep = ""))
      }
      self$`reason` <- this_object$`reason`
      self
    },
    #' Validate JSON input with respect to RunObjectIncompleteDetails
    #'
    #' @description
    #' Validate JSON input with respect to RunObjectIncompleteDetails and throw an exception if invalid
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
    #' @return String representation of RunObjectIncompleteDetails
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
# RunObjectIncompleteDetails$unlock()
#
## Below is an example to define the print function
# RunObjectIncompleteDetails$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunObjectIncompleteDetails$lock()

