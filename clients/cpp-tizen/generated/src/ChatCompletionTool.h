/*
 * ChatCompletionTool.h
 *
 * 
 */

#ifndef _ChatCompletionTool_H_
#define _ChatCompletionTool_H_


#include <string>
#include "FunctionObject.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionTool : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionTool();
	ChatCompletionTool(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionTool();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string type;
	FunctionObject function;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionTool_H_ */
