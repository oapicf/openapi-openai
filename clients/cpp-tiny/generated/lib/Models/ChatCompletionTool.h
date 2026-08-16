
/*
 * ChatCompletionTool.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionTool_H_
#define TINY_CPP_CLIENT_ChatCompletionTool_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FunctionObject.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionTool{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionTool();
    ChatCompletionTool(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionTool();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of the tool. Currently, only `function` is supported.
	 */
	std::string getType();

	/*! \brief Set The type of the tool. Currently, only `function` is supported.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	FunctionObject getFunction();

	/*! \brief Set 
	 */
	void setFunction(FunctionObject  function);


    private:
    std::string type{};
    FunctionObject function;
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionTool_H_ */
