/*
 * AutoChunkingStrategyRequestParam.h
 *
 * The default strategy. This strategy currently uses a &#x60;max_chunk_size_tokens&#x60; of &#x60;800&#x60; and &#x60;chunk_overlap_tokens&#x60; of &#x60;400&#x60;.
 */

#ifndef _AutoChunkingStrategyRequestParam_H_
#define _AutoChunkingStrategyRequestParam_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.
 *
 *  \ingroup Models
 *
 */

class AutoChunkingStrategyRequestParam : public Object {
public:
	/*! \brief Constructor.
	 */
	AutoChunkingStrategyRequestParam();
	AutoChunkingStrategyRequestParam(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AutoChunkingStrategyRequestParam();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Always `auto`.
	 */
	std::string getType();

	/*! \brief Set Always `auto`.
	 */
	void setType(std::string  type);

private:
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AutoChunkingStrategyRequestParam_H_ */
