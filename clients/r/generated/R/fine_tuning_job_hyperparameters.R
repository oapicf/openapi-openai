#' Create a new FineTuningJobHyperparameters
#'
#' @description
#' The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
#'
#' @docType class
#' @title FineTuningJobHyperparameters
#' @description FineTuningJobHyperparameters Class
#' @format An \code{R6Class} generator object
#' @field n_epochs  \link{FineTuningJobHyperparametersNEpochs}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuningJobHyperparameters <- R6::R6Class(
  "FineTuningJobHyperparameters",
  public = list(
    `n_epochs` = NULL,

    #' @description
    #' Initialize a new FineTuningJobHyperparameters class.
    #'
    #' @param n_epochs n_epochs
    #' @param ... Other optional arguments.
    initialize = function(`n_epochs`, ...) {
      if (!missing(`n_epochs`)) {
        stopifnot(R6::is.R6(`n_epochs`))
        self$`n_epochs` <- `n_epochs`
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
    #' @return FineTuningJobHyperparameters as a base R list.
    #' @examples
    #' # convert array of FineTuningJobHyperparameters (x) to a data frame
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
    #' Convert FineTuningJobHyperparameters to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FineTuningJobHyperparametersObject <- list()
      if (!is.null(self$`n_epochs`)) {
        FineTuningJobHyperparametersObject[["n_epochs"]] <-
          self$`n_epochs`$toSimpleType()
      }
      return(FineTuningJobHyperparametersObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuningJobHyperparameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningJobHyperparameters
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`n_epochs`)) {
        `n_epochs_object` <- FineTuningJobHyperparametersNEpochs$new()
        `n_epochs_object`$fromJSON(jsonlite::toJSON(this_object$`n_epochs`, auto_unbox = TRUE, digits = NA))
        self$`n_epochs` <- `n_epochs_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return FineTuningJobHyperparameters in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuningJobHyperparameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningJobHyperparameters
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`n_epochs` <- FineTuningJobHyperparametersNEpochs$new()$fromJSON(jsonlite::toJSON(this_object$`n_epochs`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to FineTuningJobHyperparameters and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `n_epochs`
      if (!is.null(input_json$`n_epochs`)) {
        stopifnot(R6::is.R6(input_json$`n_epochs`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobHyperparameters: the required field `n_epochs` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuningJobHyperparameters
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `n_epochs` is null
      if (is.null(self$`n_epochs`)) {
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
      # check if the required `n_epochs` is null
      if (is.null(self$`n_epochs`)) {
        invalid_fields["n_epochs"] <- "Non-nullable required field `n_epochs` cannot be null."
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
# FineTuningJobHyperparameters$unlock()
#
## Below is an example to define the print function
# FineTuningJobHyperparameters$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuningJobHyperparameters$lock()

