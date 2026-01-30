/*
 * ChunkingStrategyRequestParam.h
 *
 * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
 */

#ifndef _ChunkingStrategyRequestParam_H_
#define _ChunkingStrategyRequestParam_H_


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


/*! \brief The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 *
 *  \ingroup Models
 *
 */

class ChunkingStrategyRequestParam : public Object {
public:
	/*! \brief Constructor.
	 */
	ChunkingStrategyRequestParam();
	ChunkingStrategyRequestParam(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChunkingStrategyRequestParam();

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

#endif /* _ChunkingStrategyRequestParam_H_ */
