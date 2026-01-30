/*
 * OtherChunkingStrategyResponseParam.h
 *
 * This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the &#x60;chunking_strategy&#x60; concept was introduced in the API.
 */

#ifndef _OtherChunkingStrategyResponseParam_H_
#define _OtherChunkingStrategyResponseParam_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.
 *
 *  \ingroup Models
 *
 */

class OtherChunkingStrategyResponseParam : public Object {
public:
	/*! \brief Constructor.
	 */
	OtherChunkingStrategyResponseParam();
	OtherChunkingStrategyResponseParam(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OtherChunkingStrategyResponseParam();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Always `other`.
	 */
	std::string getType();

	/*! \brief Set Always `other`.
	 */
	void setType(std::string  type);

private:
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OtherChunkingStrategyResponseParam_H_ */
