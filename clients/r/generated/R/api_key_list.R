#' Create a new ApiKeyList
#'
#' @description
#' ApiKeyList Class
#'
#' @docType class
#' @title ApiKeyList
#' @description ApiKeyList Class
#' @format An \code{R6Class} generator object
#' @field object  character [optional]
#' @field data  list(\link{AdminApiKey}) [optional]
#' @field has_more  character [optional]
#' @field first_id  character [optional]
#' @field last_id  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ApiKeyList <- R6::R6Class(
  "ApiKeyList",
  public = list(
    `object` = NULL,
    `data` = NULL,
    `has_more` = NULL,
    `first_id` = NULL,
    `last_id` = NULL,

    #' @description
    #' Initialize a new ApiKeyList class.
    #'
    #' @param object object
    #' @param data data
    #' @param has_more has_more
    #' @param first_id first_id
    #' @param last_id last_id
    #' @param ... Other optional arguments.
    initialize = function(`object` = NULL, `data` = NULL, `has_more` = NULL, `first_id` = NULL, `last_id` = NULL, ...) {
      if (!is.null(`object`)) {
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!is.null(`data`)) {
        stopifnot(is.vector(`data`), length(`data`) != 0)
        sapply(`data`, function(x) stopifnot(R6::is.R6(x)))
        self$`data` <- `data`
      }
      if (!is.null(`has_more`)) {
        if (!(is.logical(`has_more`) && length(`has_more`) == 1)) {
          stop(paste("Error! Invalid data for `has_more`. Must be a boolean:", `has_more`))
        }
        self$`has_more` <- `has_more`
      }
      if (!is.null(`first_id`)) {
        if (!(is.character(`first_id`) && length(`first_id`) == 1)) {
          stop(paste("Error! Invalid data for `first_id`. Must be a string:", `first_id`))
        }
        self$`first_id` <- `first_id`
      }
      if (!is.null(`last_id`)) {
        if (!(is.character(`last_id`) && length(`last_id`) == 1)) {
          stop(paste("Error! Invalid data for `last_id`. Must be a string:", `last_id`))
        }
        self$`last_id` <- `last_id`
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
    #' @return ApiKeyList as a base R list.
    #' @examples
    #' # convert array of ApiKeyList (x) to a data frame
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
    #' Convert ApiKeyList to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ApiKeyListObject <- list()
      if (!is.null(self$`object`)) {
        ApiKeyListObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`data`)) {
        ApiKeyListObject[["data"]] <-
          lapply(self$`data`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`has_more`)) {
        ApiKeyListObject[["has_more"]] <-
          self$`has_more`
      }
      if (!is.null(self$`first_id`)) {
        ApiKeyListObject[["first_id"]] <-
          self$`first_id`
      }
      if (!is.null(self$`last_id`)) {
        ApiKeyListObject[["last_id"]] <-
          self$`last_id`
      }
      return(ApiKeyListObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ApiKeyList
    #'
    #' @param input_json the JSON input
    #' @return the instance of ApiKeyList
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[AdminApiKey]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`has_more`)) {
        self$`has_more` <- this_object$`has_more`
      }
      if (!is.null(this_object$`first_id`)) {
        self$`first_id` <- this_object$`first_id`
      }
      if (!is.null(this_object$`last_id`)) {
        self$`last_id` <- this_object$`last_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ApiKeyList in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ApiKeyList
    #'
    #' @param input_json the JSON input
    #' @return the instance of ApiKeyList
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`object` <- this_object$`object`
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[AdminApiKey]", loadNamespace("openapi"))
      self$`has_more` <- this_object$`has_more`
      self$`first_id` <- this_object$`first_id`
      self$`last_id` <- this_object$`last_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to ApiKeyList and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ApiKeyList
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
# ApiKeyList$unlock()
#
## Below is an example to define the print function
# ApiKeyList$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ApiKeyList$lock()

