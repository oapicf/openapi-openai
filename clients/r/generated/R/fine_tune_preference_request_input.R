#' Create a new FineTunePreferenceRequestInput
#'
#' @description
#' The per-line training example of a fine-tuning input file for chat models using the dpo method.
#'
#' @docType class
#' @title FineTunePreferenceRequestInput
#' @description FineTunePreferenceRequestInput Class
#' @format An \code{R6Class} generator object
#' @field input  \link{FineTunePreferenceRequestInputInput} [optional]
#' @field preferred_completion The preferred completion message for the output. list(\link{FineTunePreferenceRequestInputPreferredCompletionInner}) [optional]
#' @field non_preferred_completion The non-preferred completion message for the output. list(\link{FineTunePreferenceRequestInputPreferredCompletionInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTunePreferenceRequestInput <- R6::R6Class(
  "FineTunePreferenceRequestInput",
  public = list(
    `input` = NULL,
    `preferred_completion` = NULL,
    `non_preferred_completion` = NULL,

    #' @description
    #' Initialize a new FineTunePreferenceRequestInput class.
    #'
    #' @param input input
    #' @param preferred_completion The preferred completion message for the output.
    #' @param non_preferred_completion The non-preferred completion message for the output.
    #' @param ... Other optional arguments.
    initialize = function(`input` = NULL, `preferred_completion` = NULL, `non_preferred_completion` = NULL, ...) {
      if (!is.null(`input`)) {
        stopifnot(R6::is.R6(`input`))
        self$`input` <- `input`
      }
      if (!is.null(`preferred_completion`)) {
        stopifnot(is.vector(`preferred_completion`), length(`preferred_completion`) != 0)
        sapply(`preferred_completion`, function(x) stopifnot(R6::is.R6(x)))
        self$`preferred_completion` <- `preferred_completion`
      }
      if (!is.null(`non_preferred_completion`)) {
        stopifnot(is.vector(`non_preferred_completion`), length(`non_preferred_completion`) != 0)
        sapply(`non_preferred_completion`, function(x) stopifnot(R6::is.R6(x)))
        self$`non_preferred_completion` <- `non_preferred_completion`
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
    #' @return FineTunePreferenceRequestInput as a base R list.
    #' @examples
    #' # convert array of FineTunePreferenceRequestInput (x) to a data frame
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
    #' Convert FineTunePreferenceRequestInput to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FineTunePreferenceRequestInputObject <- list()
      if (!is.null(self$`input`)) {
        FineTunePreferenceRequestInputObject[["input"]] <-
          self$`input`$toSimpleType()
      }
      if (!is.null(self$`preferred_completion`)) {
        FineTunePreferenceRequestInputObject[["preferred_completion"]] <-
          lapply(self$`preferred_completion`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`non_preferred_completion`)) {
        FineTunePreferenceRequestInputObject[["non_preferred_completion"]] <-
          lapply(self$`non_preferred_completion`, function(x) x$toSimpleType())
      }
      return(FineTunePreferenceRequestInputObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTunePreferenceRequestInput
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTunePreferenceRequestInput
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`input`)) {
        `input_object` <- FineTunePreferenceRequestInputInput$new()
        `input_object`$fromJSON(jsonlite::toJSON(this_object$`input`, auto_unbox = TRUE, digits = NA))
        self$`input` <- `input_object`
      }
      if (!is.null(this_object$`preferred_completion`)) {
        self$`preferred_completion` <- ApiClient$new()$deserializeObj(this_object$`preferred_completion`, "array[FineTunePreferenceRequestInputPreferredCompletionInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`non_preferred_completion`)) {
        self$`non_preferred_completion` <- ApiClient$new()$deserializeObj(this_object$`non_preferred_completion`, "array[FineTunePreferenceRequestInputPreferredCompletionInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return FineTunePreferenceRequestInput in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTunePreferenceRequestInput
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTunePreferenceRequestInput
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`input` <- FineTunePreferenceRequestInputInput$new()$fromJSON(jsonlite::toJSON(this_object$`input`, auto_unbox = TRUE, digits = NA))
      self$`preferred_completion` <- ApiClient$new()$deserializeObj(this_object$`preferred_completion`, "array[FineTunePreferenceRequestInputPreferredCompletionInner]", loadNamespace("openapi"))
      self$`non_preferred_completion` <- ApiClient$new()$deserializeObj(this_object$`non_preferred_completion`, "array[FineTunePreferenceRequestInputPreferredCompletionInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to FineTunePreferenceRequestInput and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTunePreferenceRequestInput
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (length(self$`preferred_completion`) > 1) {
        return(FALSE)
      }

      if (length(self$`non_preferred_completion`) > 1) {
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
      if (length(self$`preferred_completion`) > 1) {
        invalid_fields["preferred_completion"] <- "Invalid length for `preferred_completion`, number of items must be less than or equal to 1."
      }

      if (length(self$`non_preferred_completion`) > 1) {
        invalid_fields["non_preferred_completion"] <- "Invalid length for `non_preferred_completion`, number of items must be less than or equal to 1."
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
# FineTunePreferenceRequestInput$unlock()
#
## Below is an example to define the print function
# FineTunePreferenceRequestInput$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTunePreferenceRequestInput$lock()

