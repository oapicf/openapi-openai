/*
 * VectorStoreFileBatchObject_file_counts.h
 *
 * 
 */

#ifndef _VectorStoreFileBatchObject_file_counts_H_
#define _VectorStoreFileBatchObject_file_counts_H_


#include <string>
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

class VectorStoreFileBatchObject_file_counts : public Object {
public:
	/*! \brief Constructor.
	 */
	VectorStoreFileBatchObject_file_counts();
	VectorStoreFileBatchObject_file_counts(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VectorStoreFileBatchObject_file_counts();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The number of files that are currently being processed.
	 */
	int getInProgress();

	/*! \brief Set The number of files that are currently being processed.
	 */
	void setInProgress(int  in_progress);
	/*! \brief Get The number of files that have been processed.
	 */
	int getCompleted();

	/*! \brief Set The number of files that have been processed.
	 */
	void setCompleted(int  completed);
	/*! \brief Get The number of files that have failed to process.
	 */
	int getFailed();

	/*! \brief Set The number of files that have failed to process.
	 */
	void setFailed(int  failed);
	/*! \brief Get The number of files that where cancelled.
	 */
	int getCancelled();

	/*! \brief Set The number of files that where cancelled.
	 */
	void setCancelled(int  cancelled);
	/*! \brief Get The total number of files.
	 */
	int getTotal();

	/*! \brief Set The total number of files.
	 */
	void setTotal(int  total);

private:
	int in_progress;
	int completed;
	int failed;
	int cancelled;
	int total;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VectorStoreFileBatchObject_file_counts_H_ */
