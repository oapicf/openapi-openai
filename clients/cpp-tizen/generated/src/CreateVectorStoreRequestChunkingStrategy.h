/*
 * CreateVectorStoreRequest_chunking_strategy.h
 *
 * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy. Only applicable if &#x60;file_ids&#x60; is non-empty.
 */

#ifndef _CreateVectorStoreRequest_chunking_strategy_H_
#define _CreateVectorStoreRequest_chunking_strategy_H_


#include <string>
#include "AutoChunkingStrategyRequestParam.h"
#include "StaticChunkingStrategy.h"
#include "StaticChunkingStrategyRequestParam.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.
 *
 *  \ingroup Models
 *
 */

class CreateVectorStoreRequest_chunking_strategy : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateVectorStoreRequest_chunking_strategy();
	CreateVectorStoreRequest_chunking_strategy(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateVectorStoreRequest_chunking_strategy();

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
	/*! \brief Get 
	 */
	StaticChunkingStrategy getRStatic();

	/*! \brief Set 
	 */
	void setRStatic(StaticChunkingStrategy  r_static);

private:
	std::string type;
	StaticChunkingStrategy r_static;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateVectorStoreRequest_chunking_strategy_H_ */
