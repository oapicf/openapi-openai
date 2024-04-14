#' @docType class
#' @title CreateTranslation200Response
#'
#' @description CreateTranslation200Response Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateTranslation200Response <- R6::R6Class(
  "CreateTranslation200Response",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("CreateTranslationResponseJson", "CreateTranslationResponseVerboseJson"),
    #' Initialize a new CreateTranslation200Response.
    #'
    #' @description
    #' Initialize a new CreateTranslation200Response.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "CreateTranslationResponseJson", "CreateTranslationResponseVerboseJson"
    #' @export
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CreateTranslationResponseJson") {
        self$actual_instance <- instance
        self$actual_type <- "CreateTranslationResponseJson"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "CreateTranslationResponseVerboseJson") {
        self$actual_instance <- instance
        self$actual_type <- "CreateTranslationResponseVerboseJson"
      } else {
        stop(paste("Failed to initialize CreateTranslation200Response with oneOf schemas CreateTranslationResponseJson, CreateTranslationResponseVerboseJson. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },
    #' Deserialize JSON string into an instance of CreateTranslation200Response.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateTranslation200Response.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #' @return An instance of CreateTranslation200Response.
    #' @export
    fromJSONString = function(input) {
      self$fromJSON(input)
    },
    #' Deserialize JSON string into an instance of CreateTranslation200Response.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateTranslation200Response.
    #'
    #' @param input The input JSON.
    #' @return An instance of CreateTranslation200Response.
    #' @export
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `CreateTranslationResponseJson_result` <- tryCatch({
          `CreateTranslationResponseJson`$public_methods$validateJSON(input)
          `CreateTranslationResponseJson_instance` <- `CreateTranslationResponseJson`$new()
          instance <- `CreateTranslationResponseJson_instance`$fromJSON(input)
          instance_type <- "CreateTranslationResponseJson"
          matched_schemas <- append(matched_schemas, "CreateTranslationResponseJson")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CreateTranslationResponseJson_result`["error"])) {
        error_messages <- append(error_messages, `CreateTranslationResponseJson_result`["message"])
      }

      `CreateTranslationResponseVerboseJson_result` <- tryCatch({
          `CreateTranslationResponseVerboseJson`$public_methods$validateJSON(input)
          `CreateTranslationResponseVerboseJson_instance` <- `CreateTranslationResponseVerboseJson`$new()
          instance <- `CreateTranslationResponseVerboseJson_instance`$fromJSON(input)
          instance_type <- "CreateTranslationResponseVerboseJson"
          matched_schemas <- append(matched_schemas, "CreateTranslationResponseVerboseJson")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`CreateTranslationResponseVerboseJson_result`["error"])) {
        error_messages <- append(error_messages, `CreateTranslationResponseVerboseJson_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CreateTranslation200Response with oneOf schemas CreateTranslationResponseJson, CreateTranslationResponseVerboseJson. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CreateTranslation200Response with oneOf schemas CreateTranslationResponseJson, CreateTranslationResponseVerboseJson. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },
    #' Serialize CreateTranslation200Response to JSON string.
    #'
    #' @description
    #' Serialize CreateTranslation200Response to JSON string.
    #'
    #' @return JSON string representation of the CreateTranslation200Response.
    #' @export
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },
    #' Serialize CreateTranslation200Response to JSON.
    #'
    #' @description
    #' Serialize CreateTranslation200Response to JSON.
    #'
    #' @return JSON representation of the CreateTranslation200Response.
    #' @export
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },
    #' Validate the input JSON with respect to CreateTranslation200Response.
    #'
    #' @description
    #' Validate the input JSON with respect to CreateTranslation200Response and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    #' @export
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },
    #' Returns the string representation of the instance.
    #'
    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    #' @export
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
#CreateTranslation200Response$unlock()
#
## Below is an example to define the print function
#CreateTranslation200Response$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CreateTranslation200Response$lock()

