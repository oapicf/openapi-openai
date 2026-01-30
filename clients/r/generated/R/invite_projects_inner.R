#' Create a new InviteProjectsInner
#'
#' @description
#' InviteProjectsInner Class
#'
#' @docType class
#' @title InviteProjectsInner
#' @description InviteProjectsInner Class
#' @format An \code{R6Class} generator object
#' @field id Project's public ID character [optional]
#' @field role Project membership role character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
InviteProjectsInner <- R6::R6Class(
  "InviteProjectsInner",
  public = list(
    `id` = NULL,
    `role` = NULL,

    #' @description
    #' Initialize a new InviteProjectsInner class.
    #'
    #' @param id Project's public ID
    #' @param role Project membership role
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `role` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`role`)) {
        if (!(`role` %in% c("member", "owner"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"member\", \"owner\".", sep = ""))
        }
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
    #' @return InviteProjectsInner as a base R list.
    #' @examples
    #' # convert array of InviteProjectsInner (x) to a data frame
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
    #' Convert InviteProjectsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      InviteProjectsInnerObject <- list()
      if (!is.null(self$`id`)) {
        InviteProjectsInnerObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`role`)) {
        InviteProjectsInnerObject[["role"]] <-
          self$`role`
      }
      return(InviteProjectsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteProjectsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteProjectsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("member", "owner"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"member\", \"owner\".", sep = ""))
        }
        self$`role` <- this_object$`role`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return InviteProjectsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteProjectsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteProjectsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("member", "owner"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"member\", \"owner\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self
    },

    #' @description
    #' Validate JSON input with respect to InviteProjectsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of InviteProjectsInner
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
# InviteProjectsInner$unlock()
#
## Below is an example to define the print function
# InviteProjectsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# InviteProjectsInner$lock()

