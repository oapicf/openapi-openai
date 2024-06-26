/*
 * ImagesResponse.h
 *
 * 
 */

#ifndef _ImagesResponse_H_
#define _ImagesResponse_H_


#include <string>
#include "Image.h"
#include <list>
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

class ImagesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ImagesResponse();
	ImagesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ImagesResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getCreated();

	/*! \brief Set 
	 */
	void setCreated(int  created);
	/*! \brief Get 
	 */
	std::list<Image> getData();

	/*! \brief Set 
	 */
	void setData(std::list <Image> data);

private:
	int created;
	std::list <Image>data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ImagesResponse_H_ */
