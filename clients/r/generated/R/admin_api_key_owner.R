#' Create a new AdminApiKeyOwner
#'
#' @description
#' AdminApiKeyOwner Class
#'
#' @docType class
#' @title AdminApiKeyOwner
#' @description AdminApiKeyOwner Class
#' @format An \code{R6Class} generator object
#' @field type  character [optional]
#' @field id  character [optional]
#' @field name  character [optional]
#' @field created_at  integer [optional]
#' @field role  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdminApiKeyOwner <- R6::R6Class(
  "AdminApiKeyOwner",
  public = list(
    `type` = NULL,
    `id` = NULL,
    `name` = NULL,
    `created_at` = NULL,
    `role` = NULL,

    #' @description
    #' Initialize a new AdminApiKeyOwner class.
    #'
    #' @param type type
    #' @param id id
    #' @param name name
    #' @param created_at created_at
    #' @param role role
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `id` = NULL, `name` = NULL, `created_at` = NULL, `role` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
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
      if (!is.null(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!is.null(`role`)) {
        if (!(is.character(`role`) && length(`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", `role`))
        }
        self$`role` <- `role`
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
    #' @return AdminApiKeyOwner as a base R list.
    #' @examples
    #' # convert array of AdminApiKeyOwner (x) to a data frame
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
    #' Convert AdminApiKeyOwner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdminApiKeyOwnerObject <- list()
      if (!is.null(self$`type`)) {
        AdminApiKeyOwnerObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`id`)) {
        AdminApiKeyOwnerObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        AdminApiKeyOwnerObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`created_at`)) {
        AdminApiKeyOwnerObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`role`)) {
        AdminApiKeyOwnerObject[["role"]] <-
          self$`role`
      }
      return(AdminApiKeyOwnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdminApiKeyOwner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdminApiKeyOwner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`role`)) {
        self$`role` <- this_object$`role`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdminApiKeyOwner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdminApiKeyOwner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdminApiKeyOwner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- this_object$`type`
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`created_at` <- this_object$`created_at`
      self$`role` <- this_object$`role`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdminApiKeyOwner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdminApiKeyOwner
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
# AdminApiKeyOwner$unlock()
#
## Below is an example to define the print function
# AdminApiKeyOwner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdminApiKeyOwner$lock()

