#' Create a new FineTuneMethod
#'
#' @description
#' The method used for fine-tuning.
#'
#' @docType class
#' @title FineTuneMethod
#' @description FineTuneMethod Class
#' @format An \code{R6Class} generator object
#' @field type The type of method. Is either `supervised` or `dpo`. character [optional]
#' @field supervised  \link{FineTuneSupervisedMethod} [optional]
#' @field dpo  \link{FineTuneDPOMethod} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuneMethod <- R6::R6Class(
  "FineTuneMethod",
  public = list(
    `type` = NULL,
    `supervised` = NULL,
    `dpo` = NULL,

    #' @description
    #' Initialize a new FineTuneMethod class.
    #'
    #' @param type The type of method. Is either `supervised` or `dpo`.
    #' @param supervised supervised
    #' @param dpo dpo
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `supervised` = NULL, `dpo` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c("supervised", "dpo"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"supervised\", \"dpo\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`supervised`)) {
        stopifnot(R6::is.R6(`supervised`))
        self$`supervised` <- `supervised`
      }
      if (!is.null(`dpo`)) {
        stopifnot(R6::is.R6(`dpo`))
        self$`dpo` <- `dpo`
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
    #' @return FineTuneMethod as a base R list.
    #' @examples
    #' # convert array of FineTuneMethod (x) to a data frame
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
    #' Convert FineTuneMethod to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FineTuneMethodObject <- list()
      if (!is.null(self$`type`)) {
        FineTuneMethodObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`supervised`)) {
        FineTuneMethodObject[["supervised"]] <-
          self$`supervised`$toSimpleType()
      }
      if (!is.null(self$`dpo`)) {
        FineTuneMethodObject[["dpo"]] <-
          self$`dpo`$toSimpleType()
      }
      return(FineTuneMethodObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuneMethod
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuneMethod
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("supervised", "dpo"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"supervised\", \"dpo\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`supervised`)) {
        `supervised_object` <- FineTuneSupervisedMethod$new()
        `supervised_object`$fromJSON(jsonlite::toJSON(this_object$`supervised`, auto_unbox = TRUE, digits = NA))
        self$`supervised` <- `supervised_object`
      }
      if (!is.null(this_object$`dpo`)) {
        `dpo_object` <- FineTuneDPOMethod$new()
        `dpo_object`$fromJSON(jsonlite::toJSON(this_object$`dpo`, auto_unbox = TRUE, digits = NA))
        self$`dpo` <- `dpo_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return FineTuneMethod in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuneMethod
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuneMethod
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("supervised", "dpo"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"supervised\", \"dpo\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`supervised` <- FineTuneSupervisedMethod$new()$fromJSON(jsonlite::toJSON(this_object$`supervised`, auto_unbox = TRUE, digits = NA))
      self$`dpo` <- FineTuneDPOMethod$new()$fromJSON(jsonlite::toJSON(this_object$`dpo`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to FineTuneMethod and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuneMethod
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
# FineTuneMethod$unlock()
#
## Below is an example to define the print function
# FineTuneMethod$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuneMethod$lock()

