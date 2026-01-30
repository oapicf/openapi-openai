#' Create a new ProjectApiKeyOwner
#'
#' @description
#' ProjectApiKeyOwner Class
#'
#' @docType class
#' @title ProjectApiKeyOwner
#' @description ProjectApiKeyOwner Class
#' @format An \code{R6Class} generator object
#' @field type `user` or `service_account` character [optional]
#' @field user  \link{ProjectUser} [optional]
#' @field service_account  \link{ProjectServiceAccount} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProjectApiKeyOwner <- R6::R6Class(
  "ProjectApiKeyOwner",
  public = list(
    `type` = NULL,
    `user` = NULL,
    `service_account` = NULL,

    #' @description
    #' Initialize a new ProjectApiKeyOwner class.
    #'
    #' @param type `user` or `service_account`
    #' @param user user
    #' @param service_account service_account
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `user` = NULL, `service_account` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c("user", "service_account"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"user\", \"service_account\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
      }
      if (!is.null(`service_account`)) {
        stopifnot(R6::is.R6(`service_account`))
        self$`service_account` <- `service_account`
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
    #' @return ProjectApiKeyOwner as a base R list.
    #' @examples
    #' # convert array of ProjectApiKeyOwner (x) to a data frame
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
    #' Convert ProjectApiKeyOwner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProjectApiKeyOwnerObject <- list()
      if (!is.null(self$`type`)) {
        ProjectApiKeyOwnerObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`user`)) {
        ProjectApiKeyOwnerObject[["user"]] <-
          self$`user`$toSimpleType()
      }
      if (!is.null(self$`service_account`)) {
        ProjectApiKeyOwnerObject[["service_account"]] <-
          self$`service_account`$toSimpleType()
      }
      return(ProjectApiKeyOwnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectApiKeyOwner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectApiKeyOwner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("user", "service_account"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"user\", \"service_account\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`user`)) {
        `user_object` <- ProjectUser$new()
        `user_object`$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
        self$`user` <- `user_object`
      }
      if (!is.null(this_object$`service_account`)) {
        `service_account_object` <- ProjectServiceAccount$new()
        `service_account_object`$fromJSON(jsonlite::toJSON(this_object$`service_account`, auto_unbox = TRUE, digits = NA))
        self$`service_account` <- `service_account_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProjectApiKeyOwner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectApiKeyOwner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectApiKeyOwner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("user", "service_account"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"user\", \"service_account\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`user` <- ProjectUser$new()$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
      self$`service_account` <- ProjectServiceAccount$new()$fromJSON(jsonlite::toJSON(this_object$`service_account`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ProjectApiKeyOwner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProjectApiKeyOwner
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
# ProjectApiKeyOwner$unlock()
#
## Below is an example to define the print function
# ProjectApiKeyOwner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProjectApiKeyOwner$lock()

