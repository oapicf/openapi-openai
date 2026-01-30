#' Create a new RealtimeResponseCreateParamsToolsInner
#'
#' @description
#' RealtimeResponseCreateParamsToolsInner Class
#'
#' @docType class
#' @title RealtimeResponseCreateParamsToolsInner
#' @description RealtimeResponseCreateParamsToolsInner Class
#' @format An \code{R6Class} generator object
#' @field type The type of the tool, i.e. `function`. character [optional]
#' @field name The name of the function. character [optional]
#' @field description The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). character [optional]
#' @field parameters Parameters of the function in JSON Schema. object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeResponseCreateParamsToolsInner <- R6::R6Class(
  "RealtimeResponseCreateParamsToolsInner",
  public = list(
    `type` = NULL,
    `name` = NULL,
    `description` = NULL,
    `parameters` = NULL,

    #' @description
    #' Initialize a new RealtimeResponseCreateParamsToolsInner class.
    #'
    #' @param type The type of the tool, i.e. `function`.
    #' @param name The name of the function.
    #' @param description The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything).
    #' @param parameters Parameters of the function in JSON Schema.
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `name` = NULL, `description` = NULL, `parameters` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c("function"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`parameters`)) {
        self$`parameters` <- `parameters`
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
    #' @return RealtimeResponseCreateParamsToolsInner as a base R list.
    #' @examples
    #' # convert array of RealtimeResponseCreateParamsToolsInner (x) to a data frame
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
    #' Convert RealtimeResponseCreateParamsToolsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeResponseCreateParamsToolsInnerObject <- list()
      if (!is.null(self$`type`)) {
        RealtimeResponseCreateParamsToolsInnerObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`name`)) {
        RealtimeResponseCreateParamsToolsInnerObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        RealtimeResponseCreateParamsToolsInnerObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`parameters`)) {
        RealtimeResponseCreateParamsToolsInnerObject[["parameters"]] <-
          self$`parameters`
      }
      return(RealtimeResponseCreateParamsToolsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeResponseCreateParamsToolsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeResponseCreateParamsToolsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`parameters`)) {
        self$`parameters` <- this_object$`parameters`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeResponseCreateParamsToolsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeResponseCreateParamsToolsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeResponseCreateParamsToolsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      self$`parameters` <- this_object$`parameters`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeResponseCreateParamsToolsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeResponseCreateParamsToolsInner
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
# RealtimeResponseCreateParamsToolsInner$unlock()
#
## Below is an example to define the print function
# RealtimeResponseCreateParamsToolsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeResponseCreateParamsToolsInner$lock()

