#' Create a new AdminApiKey
#'
#' @description
#' AdminApiKey Class
#'
#' @docType class
#' @title AdminApiKey
#' @description AdminApiKey Class
#' @format An \code{R6Class} generator object
#' @field object  character [optional]
#' @field id  character [optional]
#' @field name  character [optional]
#' @field redacted_value  character [optional]
#' @field value  character [optional]
#' @field created_at  integer [optional]
#' @field owner  \link{AdminApiKeyOwner} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdminApiKey <- R6::R6Class(
  "AdminApiKey",
  public = list(
    `object` = NULL,
    `id` = NULL,
    `name` = NULL,
    `redacted_value` = NULL,
    `value` = NULL,
    `created_at` = NULL,
    `owner` = NULL,

    #' @description
    #' Initialize a new AdminApiKey class.
    #'
    #' @param object object
    #' @param id id
    #' @param name name
    #' @param redacted_value redacted_value
    #' @param value value
    #' @param created_at created_at
    #' @param owner owner
    #' @param ... Other optional arguments.
    initialize = function(`object` = NULL, `id` = NULL, `name` = NULL, `redacted_value` = NULL, `value` = NULL, `created_at` = NULL, `owner` = NULL, ...) {
      if (!is.null(`object`)) {
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`redacted_value`)) {
        if (!(is.character(`redacted_value`) && length(`redacted_value`) == 1)) {
          stop(paste("Error! Invalid data for `redacted_value`. Must be a string:", `redacted_value`))
        }
        self$`redacted_value` <- `redacted_value`
      }
      if (!is.null(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
      if (!is.null(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!is.null(`owner`)) {
        stopifnot(R6::is.R6(`owner`))
        self$`owner` <- `owner`
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
    #' @return AdminApiKey as a base R list.
    #' @examples
    #' # convert array of AdminApiKey (x) to a data frame
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
    #' Convert AdminApiKey to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdminApiKeyObject <- list()
      if (!is.null(self$`object`)) {
        AdminApiKeyObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`id`)) {
        AdminApiKeyObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        AdminApiKeyObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`redacted_value`)) {
        AdminApiKeyObject[["redacted_value"]] <-
          self$`redacted_value`
      }
      if (!is.null(self$`value`)) {
        AdminApiKeyObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`created_at`)) {
        AdminApiKeyObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`owner`)) {
        AdminApiKeyObject[["owner"]] <-
          self$`owner`$toSimpleType()
      }
      return(AdminApiKeyObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdminApiKey
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdminApiKey
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`redacted_value`)) {
        self$`redacted_value` <- this_object$`redacted_value`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`owner`)) {
        `owner_object` <- AdminApiKeyOwner$new()
        `owner_object`$fromJSON(jsonlite::toJSON(this_object$`owner`, auto_unbox = TRUE, digits = NA))
        self$`owner` <- `owner_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdminApiKey in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdminApiKey
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdminApiKey
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`object` <- this_object$`object`
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`redacted_value` <- this_object$`redacted_value`
      self$`value` <- this_object$`value`
      self$`created_at` <- this_object$`created_at`
      self$`owner` <- AdminApiKeyOwner$new()$fromJSON(jsonlite::toJSON(this_object$`owner`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdminApiKey and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdminApiKey
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
# AdminApiKey$unlock()
#
## Below is an example to define the print function
# AdminApiKey$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdminApiKey$lock()

