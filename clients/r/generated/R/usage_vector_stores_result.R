#' Create a new UsageVectorStoresResult
#'
#' @description
#' The aggregated vector stores usage details of the specific time bucket.
#'
#' @docType class
#' @title UsageVectorStoresResult
#' @description UsageVectorStoresResult Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field usage_bytes The vector stores usage in bytes. integer
#' @field project_id When `group_by=project_id`, this field provides the project ID of the grouped usage result. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UsageVectorStoresResult <- R6::R6Class(
  "UsageVectorStoresResult",
  public = list(
    `object` = NULL,
    `usage_bytes` = NULL,
    `project_id` = NULL,

    #' @description
    #' Initialize a new UsageVectorStoresResult class.
    #'
    #' @param object object
    #' @param usage_bytes The vector stores usage in bytes.
    #' @param project_id When `group_by=project_id`, this field provides the project ID of the grouped usage result.
    #' @param ... Other optional arguments.
    initialize = function(`object`, `usage_bytes`, `project_id` = NULL, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("organization.usage.vector_stores.result"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"organization.usage.vector_stores.result\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`usage_bytes`)) {
        if (!(is.numeric(`usage_bytes`) && length(`usage_bytes`) == 1)) {
          stop(paste("Error! Invalid data for `usage_bytes`. Must be an integer:", `usage_bytes`))
        }
        self$`usage_bytes` <- `usage_bytes`
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
    #' @return UsageVectorStoresResult as a base R list.
    #' @examples
    #' # convert array of UsageVectorStoresResult (x) to a data frame
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
    #' Convert UsageVectorStoresResult to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UsageVectorStoresResultObject <- list()
      if (!is.null(self$`object`)) {
        UsageVectorStoresResultObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`usage_bytes`)) {
        UsageVectorStoresResultObject[["usage_bytes"]] <-
          self$`usage_bytes`
      }
      if (!is.null(self$`project_id`)) {
        UsageVectorStoresResultObject[["project_id"]] <-
          self$`project_id`
      }
      return(UsageVectorStoresResultObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageVectorStoresResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsageVectorStoresResult
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.usage.vector_stores.result"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.usage.vector_stores.result\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`usage_bytes`)) {
        self$`usage_bytes` <- this_object$`usage_bytes`
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
    #' @return UsageVectorStoresResult in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageVectorStoresResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsageVectorStoresResult
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.usage.vector_stores.result"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.usage.vector_stores.result\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`usage_bytes` <- this_object$`usage_bytes`
      self$`project_id` <- this_object$`project_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to UsageVectorStoresResult and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for UsageVectorStoresResult: the required field `object` is missing."))
      }
      # check the required field `usage_bytes`
      if (!is.null(input_json$`usage_bytes`)) {
        if (!(is.numeric(input_json$`usage_bytes`) && length(input_json$`usage_bytes`) == 1)) {
          stop(paste("Error! Invalid data for `usage_bytes`. Must be an integer:", input_json$`usage_bytes`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageVectorStoresResult: the required field `usage_bytes` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UsageVectorStoresResult
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

      # check if the required `usage_bytes` is null
      if (is.null(self$`usage_bytes`)) {
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

      # check if the required `usage_bytes` is null
      if (is.null(self$`usage_bytes`)) {
        invalid_fields["usage_bytes"] <- "Non-nullable required field `usage_bytes` cannot be null."
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
# UsageVectorStoresResult$unlock()
#
## Below is an example to define the print function
# UsageVectorStoresResult$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UsageVectorStoresResult$lock()

