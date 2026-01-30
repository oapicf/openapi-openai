#' Create a new CostsResult
#'
#' @description
#' The aggregated costs details of the specific time bucket.
#'
#' @docType class
#' @title CostsResult
#' @description CostsResult Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field amount  \link{CostsResultAmount} [optional]
#' @field line_item When `group_by=line_item`, this field provides the line item of the grouped costs result. character [optional]
#' @field project_id When `group_by=project_id`, this field provides the project ID of the grouped costs result. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CostsResult <- R6::R6Class(
  "CostsResult",
  public = list(
    `object` = NULL,
    `amount` = NULL,
    `line_item` = NULL,
    `project_id` = NULL,

    #' @description
    #' Initialize a new CostsResult class.
    #'
    #' @param object object
    #' @param amount amount
    #' @param line_item When `group_by=line_item`, this field provides the line item of the grouped costs result.
    #' @param project_id When `group_by=project_id`, this field provides the project ID of the grouped costs result.
    #' @param ... Other optional arguments.
    initialize = function(`object`, `amount` = NULL, `line_item` = NULL, `project_id` = NULL, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("organization.costs.result"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"organization.costs.result\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!is.null(`amount`)) {
        stopifnot(R6::is.R6(`amount`))
        self$`amount` <- `amount`
      }
      if (!is.null(`line_item`)) {
        if (!(is.character(`line_item`) && length(`line_item`) == 1)) {
          stop(paste("Error! Invalid data for `line_item`. Must be a string:", `line_item`))
        }
        self$`line_item` <- `line_item`
      }
      if (!is.null(`project_id`)) {
        if (!(is.character(`project_id`) && length(`project_id`) == 1)) {
          stop(paste("Error! Invalid data for `project_id`. Must be a string:", `project_id`))
        }
        self$`project_id` <- `project_id`
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
    #' @return CostsResult as a base R list.
    #' @examples
    #' # convert array of CostsResult (x) to a data frame
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
    #' Convert CostsResult to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CostsResultObject <- list()
      if (!is.null(self$`object`)) {
        CostsResultObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`amount`)) {
        CostsResultObject[["amount"]] <-
          self$`amount`$toSimpleType()
      }
      if (!is.null(self$`line_item`)) {
        CostsResultObject[["line_item"]] <-
          self$`line_item`
      }
      if (!is.null(self$`project_id`)) {
        CostsResultObject[["project_id"]] <-
          self$`project_id`
      }
      return(CostsResultObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CostsResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of CostsResult
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.costs.result"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.costs.result\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`amount`)) {
        `amount_object` <- CostsResultAmount$new()
        `amount_object`$fromJSON(jsonlite::toJSON(this_object$`amount`, auto_unbox = TRUE, digits = NA))
        self$`amount` <- `amount_object`
      }
      if (!is.null(this_object$`line_item`)) {
        self$`line_item` <- this_object$`line_item`
      }
      if (!is.null(this_object$`project_id`)) {
        self$`project_id` <- this_object$`project_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CostsResult in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CostsResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of CostsResult
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.costs.result"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.costs.result\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`amount` <- CostsResultAmount$new()$fromJSON(jsonlite::toJSON(this_object$`amount`, auto_unbox = TRUE, digits = NA))
      self$`line_item` <- this_object$`line_item`
      self$`project_id` <- this_object$`project_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to CostsResult and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CostsResult: the required field `object` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CostsResult
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `object` is null
      if (is.null(self$`object`)) {
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
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
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
# CostsResult$unlock()
#
## Below is an example to define the print function
# CostsResult$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CostsResult$lock()

